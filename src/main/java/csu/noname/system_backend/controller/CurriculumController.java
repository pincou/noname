package csu.noname.system_backend.controller;

import io.swagger.annotations.Api;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "学生课程管理接口")
@Transactional
public class CurriculumController {
}
