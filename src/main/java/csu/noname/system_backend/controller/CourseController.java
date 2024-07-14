package csu.noname.system_backend.controller;

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
@Transactional
public class CourseController {
    @Autowired
    private CourseService courseService;

    // 获取所有课程列表
    @GetMapping("/courses")
    @ApiOperation(value = "获取所有课程列表")
    public CommonResponse<List<CourseVO>> getAllCourses() {
        List<CourseVO> courses = courseService.listCourses();
        return CommonResponse.createForSuccess(courses);
    }

    // 根据课程号获取课程详情
    @GetMapping("/courses/{courseId}")
    @ApiOperation(value = "根据课程号获取课程详情")
    public CommonResponse<CourseVO> getCourseById(@PathVariable Integer courseId) {
        CourseVO course = courseService.getCourseById(courseId);
        if (course != null) {
            return CommonResponse.createForSuccess(course);
        } else {
            return CommonResponse.createForError(ResponseCode.ERROR.getCode(), "课程不存在");
        }
    }

    // 添加新课程
    @PostMapping("/courses")
    @ApiOperation(value = "添加新课程")
    public CommonResponse<String> addCourse(@RequestBody Course course) {
        try {
            boolean isAdded = courseService.addCourse(course);
            return isAdded ? CommonResponse.createForSuccess("课程添加成功") : CommonResponse.createForError("课程添加失败");
        } catch (Exception e) {
            return CommonResponse.createForError("添加课程过程中出现异常：" + e.getMessage());
        }
    }

    // 更新课程信息
    @PutMapping("/courses/{courseId}")
    @ApiOperation(value = "更新课程信息")
    public CommonResponse<String> updateCourse(@PathVariable Integer courseId, @RequestBody Course course) {
        try {
            boolean isUpdated = courseService.updateCourse(courseId, course);
            return isUpdated ? CommonResponse.createForSuccess("课程更新成功") : CommonResponse.createForError("课程更新失败");
        } catch (Exception e) {
            return CommonResponse.createForError("更新课程过程中出现异常：" + e.getMessage());
        }
    }

    // 删除课程
    @DeleteMapping("/courses/{courseId}")
    @ApiOperation(value = "删除课程")
    public CommonResponse<String> deleteCourse(@PathVariable Integer courseId) {
        try {
            boolean isDeleted = courseService.deleteCourse(courseId);
            return isDeleted ? CommonResponse.createForSuccess("课程删除成功") : CommonResponse.createForError("课程删除失败");
        } catch (Exception e) {
            return CommonResponse.createForError("删除课程过程中出现异常：" + e.getMessage());
        }
    }
}
