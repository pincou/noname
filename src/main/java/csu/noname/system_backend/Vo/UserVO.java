package csu.noname.system_backend.Vo;

import lombok.Data;

@Data
public class UserVO {
    private String username;
    private String password;
    private int usertype;
}
