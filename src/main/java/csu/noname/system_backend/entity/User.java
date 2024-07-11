package csu.noname.system_backend.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
public class User implements Serializable {
    private static final long serialVersionUID = 474486339829048183L;
    
    private Long username;
    
    private String password;
    
    private Integer userType;


    public Long getUsername() {
        return username;
    }

    public void setUsername(Long username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

}

