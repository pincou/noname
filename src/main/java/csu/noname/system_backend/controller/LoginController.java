package csu.noname.system_backend.controller;


import csu.noname.system_backend.Vo.UserVO;
import csu.noname.system_backend.common.CommonResponse;
import csu.noname.system_backend.service.UserService;
import io.swagger.annotations.Api;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags ="用户登录接口" )
@Transactional
@CrossOrigin("http://localhost:5173")
@RequestMapping("/login")
public class LoginController {
    @Autowired
    UserService userService;

    @GetMapping("/getuser")
    public CommonResponse<UserVO> search(
            @RequestParam("username")@NotBlank(message = "账户不能为空") String username,
            @RequestParam("password") @NotBlank(message = "密码不能为空")String password){
        UserVO userVO= userService.getUser(username,password);
        if (userVO!=null){
            return CommonResponse.createForSuccess(2000,"成功获取",userVO);
        }
        return  CommonResponse.createForError();
    }

}
