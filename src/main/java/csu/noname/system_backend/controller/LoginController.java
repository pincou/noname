package csu.noname.system_backend.controller;


import csu.noname.system_backend.VO.UserVO;
import csu.noname.system_backend.common.CommonResponse;
import csu.noname.system_backend.service.UserService;
import csu.noname.system_backend.utils.JwtUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@Api(tags ="用户登录接口" )
@Transactional
@CrossOrigin("http://localhost:5173")
@RequestMapping("/")
public class LoginController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    @ApiOperation(value = "登录功能")
    @ResponseBody
    public CommonResponse<String> UserLogin(
            @RequestParam("username")@NotBlank(message = "账户不能为空") String username,
            @RequestParam("password") @NotBlank(message = "密码不能为空")String password){

        UserVO userVO = userService.getUser(username,password);
        if (userVO!=null){
//            Map<String,Object> claims=new HashMap<>();
//            claims.put("username",username);
//            String token= JwtUtil.getToken(claims);
            return CommonResponse.createForSuccess(
                    "登录成功"+"用户类型为"+userVO.getUsertype(),null
//                    token
            );
        }
        else{
            return  CommonResponse.createForError(1001,
                    "Invalid username or password",
                    null);
        }
    }


}
