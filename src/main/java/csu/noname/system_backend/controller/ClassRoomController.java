package csu.noname.system_backend.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import csu.noname.system_backend.common.CommonResponse;
import csu.noname.system_backend.common.ResponseCode;
import csu.noname.system_backend.entity.Classroom;
import csu.noname.system_backend.service.ClassroomService;
import csu.noname.system_backend.service.SiteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/classroom")
@Api(tags = "教室预约管理接口")
@Transactional
public class ClassRoomController {
    @Autowired
    private ClassroomService classroomService;
    @Autowired
    private SiteService siteService;
    // 获取所有教室列表
    @GetMapping(value = "/all")
    @ApiOperation(value = "获取所有教室列表")
    public CommonResponse<List<Classroom>> getAllClassrooms() {
        List<Classroom> classrooms = classroomService.list();
        return CommonResponse.createForSuccess(classrooms);
    }

    // 根据教室号获取教室详情
    @PostMapping ( "/info")
    @ApiOperation(value = "根据教室号获取教室详情")
    public CommonResponse<Classroom> getClassroomByNo(@RequestParam int classroomNo,@RequestParam int siteId) {
        System.out.println(classroomNo);
        QueryWrapper<Classroom> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("classroom_no",classroomNo).eq("site_id",siteId);
        Classroom classroom = classroomService.getBaseMapper().selectOne(queryWrapper);
        if (classroom != null) {
            return CommonResponse.createForSuccess(classroom);
        } else {
            return CommonResponse.createForError(ResponseCode.ERROR.getCode(), "教室不存在");
        }
    }

    // 预约教室
    @PostMapping("/booking")
    @ApiOperation(value = "预约教室")
    public CommonResponse<String> bookClassroom(
            @RequestParam Integer classroomNo,@RequestParam int siteId, @RequestBody String bookedBy) {
        try {
            boolean isBooked= false;
            QueryWrapper<Classroom> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("classroom_no",classroomNo).eq("site_id",siteId);
            Classroom classroom = classroomService.getBaseMapper().selectOne(queryWrapper);
            classroom.setState(1);
            classroom.setBookedBy(bookedBy);
            UpdateWrapper<Classroom> updateWrapper=new UpdateWrapper<>();
            updateWrapper.eq("classroom_no",classroomNo).eq("site_id",siteId);
             isBooked = classroomService.update(classroom,updateWrapper);
            if (classroom.getState()==1) isBooked=true;
//
            return isBooked ? CommonResponse.createForSuccess("预约成功") : CommonResponse.createForError("预约失败");
        } catch (Exception e) {
            return CommonResponse.createForError("预约失败：" + e.getMessage());
        }
    }

    // 取消预约
    @PutMapping("/cancel")
    @ApiOperation(value = "取消教室预约")
    public CommonResponse<String> cancelBooking(@RequestParam Integer classroomNo,@RequestParam int siteId) {
        try {
            QueryWrapper<Classroom> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("classroom_no",classroomNo).eq("site_id",siteId);
            Classroom classroom = classroomService.getBaseMapper().selectOne(queryWrapper);
            if (classroom.getState()==0){
                return CommonResponse.createForError("该教室尚未被预约");
            }
            classroom.setState(0);
            UpdateWrapper<Classroom> updateWrapper=new UpdateWrapper<>();
            updateWrapper.eq("classroom_no",classroomNo).eq("site_id",siteId);
            boolean isCancelled = classroomService.update(classroom,updateWrapper);
            return isCancelled ? CommonResponse.createForSuccess("取消预约成功") : CommonResponse.createForError("取消预约失败");
        } catch (Exception e) {
            return CommonResponse.createForError("取消预约过程中出现异常：" + e.getMessage());
        }
    }


    @PutMapping("/state")
    @ApiOperation(value = "更新教室预约状态")
    public CommonResponse<String> updateClassroomState(
            @RequestParam Integer classroomNo,@RequestParam int siteId, @RequestParam Integer state) {
        try {
            QueryWrapper<Classroom> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("classroom_no",classroomNo).eq("site_id",siteId);
            Classroom classroom = classroomService.getBaseMapper().selectOne(queryWrapper);
            classroom.setState(1);

            UpdateWrapper<Classroom> updateWrapper=new UpdateWrapper<>();
            updateWrapper.eq("classroom_no",classroomNo).eq("site_id",siteId);
            boolean isUpdated = classroomService.update(classroom,updateWrapper);
            return isUpdated ? CommonResponse.createForSuccess("状态更新成功") : CommonResponse.createForError("状态更新失败");
        } catch (Exception e) {
            return CommonResponse.createForError("状态更新过程中出现异常：" + e.getMessage());
        }
    }

}
