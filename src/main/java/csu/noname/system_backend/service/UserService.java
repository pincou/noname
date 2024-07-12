package csu.noname.system_backend.service;

import csu.noname.system_backend.VO.UserVO;


/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
public interface UserService {
    public UserVO getUser(String username, String password);
    public UserVO  getUserByUsername(String username);
    public boolean UpdatePassword(String username,String password);
}
