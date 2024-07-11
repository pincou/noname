package csu.noname.system_backend.controller;

import io.swagger.annotations.Api;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "学生成绩查询接口")
@Transactional
public class MyScoreController {
}
