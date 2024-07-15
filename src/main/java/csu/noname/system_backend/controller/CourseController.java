package csu.noname.system_backend.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import csu.noname.system_backend.VO.CourseVO;
import csu.noname.system_backend.common.CommonResponse;
import csu.noname.system_backend.common.ResponseCode;
import csu.noname.system_backend.entity.Course;
import csu.noname.system_backend.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "任教课程管理接口")
@RequestMapping("/course")
@Transactional
public class CourseController {
    @Autowired
    private CourseService courseService;

    /**
     * 分页查询课程列表，还没写好实现
     * @param page
     * @param size
     * @return
     */
    // 获取所有课程列表
    @GetMapping("/list")
    @ApiOperation(value = "获取课程列表")
    public CommonResponse<List<Course>> getAllCourses(
//            @PathVariable int page,@PathVariable int size
    ) {
        List<Course> courses = courseService.list();
        return CommonResponse.createForSuccess(courses);
    }

    // 根据课程号获取课程详情
    @GetMapping("/{courseId}")
    @ApiOperation(value = "根据课程号获取课程详情")
    public CommonResponse<Course> getCourseById(@PathVariable(value = "courseId") Integer courseId) {
        Course course = courseService.getById(courseId);
        if (course != null) {
            return CommonResponse.createForSuccess(course);
        } else {
            return CommonResponse.createForError(ResponseCode.ERROR.getCode(), "课程不存在");
        }
    }

//     添加新课程
    @PostMapping("/addcourse")
    @ApiOperation(value = "添加新课程")
    public CommonResponse<String> addCourse(@RequestBody Course course) {
        try {
           boolean isAdded =  courseService.save(course);
            return isAdded ? CommonResponse.createForSuccess("课程添加成功") : CommonResponse.createForError("课程添加失败");
        } catch (Exception e) {
            return CommonResponse.createForError("添加课程过程中出现异常：" + e.getMessage());
        }
    }

//     更新课程信息
    @PutMapping("/{courseId}")
    @ApiOperation(value = "更新课程信息")
    public CommonResponse<String> updateCourse(@PathVariable(value = "courseId") Integer courseId, @RequestBody Course course) {
        try {
            UpdateWrapper<Course> updateWrapper=new UpdateWrapper<>();
            updateWrapper.eq("course_id",courseId);
            boolean isUpdated = courseService.update(course,updateWrapper);
            return isUpdated ? CommonResponse.createForSuccess("课程更新成功") : CommonResponse.createForError("课程更新失败");
        } catch (Exception e) {
            return CommonResponse.createForError("更新课程过程中出现异常：" + e.getMessage());
        }
    }

    // 删除课程
    @DeleteMapping("/{courseId}")
    @ApiOperation(value = "删除课程")
    public CommonResponse<String> deleteCourse(@PathVariable Integer courseId) {
        try {
            boolean isDeleted = courseService.removeById(courseId);
            return isDeleted ? CommonResponse.createForSuccess("课程删除成功") : CommonResponse.createForError("课程删除失败");
        } catch (Exception e) {
            return CommonResponse.createForError("删除课程过程中出现异常：" + e.getMessage());
        }
    }
}
