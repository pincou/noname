package csu.noname.system_backend.VO;

import lombok.Data;

@Data
public class UserVO {
    private String username;
    private String password;
    private int usertype;
}
