package csu.noname.system_backend.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import csu.noname.system_backend.Vo.UserVO;
import csu.noname.system_backend.entity.User;
import csu.noname.system_backend.persistence.UserMapper;
import csu.noname.system_backend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2024-07-11 20:36:59
 */
@Slf4j
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserVO getUser(String username, String password) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        queryWrapper.eq("password",password);
        User user= userMapper.selectOne(queryWrapper);
        if (user!=null) {
            UserVO userVo = new UserVO();
            userVo.setUsername(username);
            userVo.setPassword(password);
            userVo.setUsertype(user.getUserType());
            return userVo;
        }
        else return null;
    }

    @Override
    public User getUserByUsername(String username) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        return userMapper.selectOne(queryWrapper);
    }

    @Override
    public boolean UpdatePassword(String username, String password) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        User user= userMapper.selectOne(queryWrapper);
        if (user!=null) {
            user.setPassword(password);
            return true;
        }
        else return false;
    }
}
