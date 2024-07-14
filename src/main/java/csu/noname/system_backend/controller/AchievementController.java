package csu.noname.system_backend.controller;

import csu.noname.system_backend.service.ScoreService;
import csu.noname.system_backend.service.StudentService;
import csu.noname.system_backend.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "成绩管理接口")
@Transactional
public class AchievementController {
    @Autowired
    ScoreService scoreService;
    @Autowired
    StudentService studentService;
    @Autowired
    TeacherService teacherService;


}
