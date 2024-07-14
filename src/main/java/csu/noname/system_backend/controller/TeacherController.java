package csu.noname.system_backend.controller;

import csu.noname.system_backend.VO.StudentVO;
import csu.noname.system_backend.common.CommonResponse;
import csu.noname.system_backend.entity.Teacher;
import csu.noname.system_backend.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags ="教师功能管理接口" )
@Transactional
@CrossOrigin("http://localhost:5173")
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @GetMapping("/info")
    @ApiOperation(value = "查询教师信息")
    public CommonResponse<Teacher> getStudentInfo(
            @NotBlank(message = "教师ID不能为空") @RequestParam("teach_id")int teachID ){
       Teacher teacher= teacherService.getById(teachID);

       if (teacher!=null) {
       return CommonResponse.createForSuccess("教师信息",teacher);
       }
       else return CommonResponse.createForError();
//        StudentVO studentVO = studentService.getStudentByID(studentID);
//        if (studentVO!=null){
//            return CommonResponse.createForSuccess("成功获取学生信息",studentVO);
//        }
//        else return CommonResponse.createForError();
    }



}
