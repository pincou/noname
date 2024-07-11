package csu.noname.system_backend.controller;


import io.swagger.annotations.Api;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags ="用户登录接口" )
@Transactional
@RequestMapping("/login")
public class LoginController {

}
