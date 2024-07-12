package csu.noname.system_backend.controller;

import csu.noname.system_backend.VO.ScoreVO;
import csu.noname.system_backend.VO.StudentVO;
import csu.noname.system_backend.common.CommonResponse;
import csu.noname.system_backend.entity.Student;
import csu.noname.system_backend.service.StudentService;
import io.swagger.annotations.Api;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags ="学生功能管理接口" )
@Transactional
@CrossOrigin("http://localhost:5173")
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/info")
    public CommonResponse<StudentVO> getStudentInfo(
           @NotBlank(message = "学生ID不能为空") @RequestParam("studentID") long studentID){
        StudentVO studentVO = studentService.getStudentByID(studentID);
        if (studentVO!=null){
            return CommonResponse.createForSuccess("成功获取学生信息",studentVO);
        }
        else return CommonResponse.createForError();
    }

    @GetMapping("/avgScore")
    public CommonResponse<Double> geAvgScore(
            @NotBlank(message = "学生ID不能为空") @RequestParam("studentID") long studentID){
        double avgScore=studentService.getTotalAVGGrade(studentID);
       if (avgScore<0.0001){
          return CommonResponse.createForError();
       }else {
           double number =Math.round(avgScore * 100.0)/ 100.0;;
           return CommonResponse.createForSuccess(number);
       }
    }

    @GetMapping("/allScore")
    public CommonResponse<List<ScoreVO>> getAllScore(
            @NotBlank(message = "学生ID不能为空") @RequestParam("studentID") long studentID){
        List<ScoreVO> scoreVOS=studentService.getStudentAllScore(studentID);
        if (scoreVOS!=null){
            return CommonResponse.createForSuccess("该学生成绩列表",scoreVOS);
        }
        else return CommonResponse.createForError("未获取到该学生成绩");
    }

    @GetMapping("/allCourse")
    public CommonResponse<List<Integer>> getAllCourseIDSelected(
            @NotBlank(message = "学生ID不能为空") @RequestParam("studentID") long studentID){
        List<Integer> courseIDs=studentService.getStudentAllCourseID(studentID);
        if (courseIDs!=null){
            return CommonResponse.createForSuccess("该学生所选课程ID列表",courseIDs);
        }
        else return CommonResponse.createForError("未获取到该学生选课");
    }
}
