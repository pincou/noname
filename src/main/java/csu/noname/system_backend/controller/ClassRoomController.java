package csu.noname.system_backend.controller;

import csu.noname.system_backend.common.CommonResponse;
import csu.noname.system_backend.common.ResponseCode;
import csu.noname.system_backend.entity.Classroom;
import csu.noname.system_backend.service.ClassroomService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "教室预约管理接口")
@Transactional
public class ClassRoomController {
    @Autowired
    private ClassroomService classroomService;

    // 获取所有教室列表
    @GetMapping("/classrooms")
    @ApiOperation(value = "获取所有教室列表")
    public CommonResponse<List<Classroom>> getAllClassrooms() {
        List<Classroom> classrooms = classroomService.list();
        return CommonResponse.createForSuccess(classrooms);
    }

    // 根据教室号获取教室详情
    @GetMapping("/classrooms/{classroomNo}")
    @ApiOperation(value = "根据教室号获取教室详情")
    public CommonResponse<Classroom> getClassroomByNo(@PathVariable Integer classroomNo) {
        Classroom classroom = classroomService.getById(classroomNo);
        if (classroom != null) {
            return CommonResponse.createForSuccess(classroom);
        } else {
            return CommonResponse.createForError(ResponseCode.ERROR.getCode(), "教室不存在");
        }
    }

    // 预约教室
    @PostMapping("/classrooms/{classroomNo}/booking")
    @ApiOperation(value = "预约教室")
    public CommonResponse<String> bookClassroom(@PathVariable Integer classroomNo, @RequestBody String bookedBy) {
        try {
            boolean isBooked = classroomService.bookClassroom(classroomNo, bookedBy);
            return isBooked ? CommonResponse.createForSuccess("预约成功") : CommonResponse.createForError("预约失败");
        } catch (Exception e) {
            return CommonResponse.createForError("预约过程中出现异常：" + e.getMessage());
        }
    }

    // 取消预约
    @DeleteMapping("/classrooms/{classroomNo}/booking")
    @ApiOperation(value = "取消教室预约")
    public CommonResponse<String> cancelBooking(@PathVariable Integer classroomNo) {
        try {
            boolean isCancelled = classroomService.cancelBooking(classroomNo);
            return isCancelled ? CommonResponse.createForSuccess("取消预约成功") : CommonResponse.createForError("取消预约失败");
        } catch (Exception e) {
            return CommonResponse.createForError("取消预约过程中出现异常：" + e.getMessage());
        }
    }

    // 更新教室状态
    @PutMapping("/classrooms/{classroomNo}/state")
    @ApiOperation(value = "更新教室预约状态")
    public CommonResponse<String> updateClassroomState(@PathVariable Integer classroomNo, @RequestParam Integer state) {
        try {
            boolean isUpdated = classroomService.updateClassroomState(classroomNo, state);
            return isUpdated ? CommonResponse.createForSuccess("状态更新成功") : CommonResponse.createForError("状态更新失败");
        } catch (Exception e) {
            return CommonResponse.createForError("状态更新过程中出现异常：" + e.getMessage());
        }
    }
}