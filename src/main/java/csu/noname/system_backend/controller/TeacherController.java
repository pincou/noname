package csu.noname.system_backend.controller;

import io.swagger.annotations.Api;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags ="教师功能管理接口" )
@Transactional
@CrossOrigin("http://localhost:5173")
@RequestMapping("/teacher")
public class TeacherController {
}
