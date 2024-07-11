package csu.noname.system_backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
@Data
@Entity
@TableName("user")
@ApiModel(value = "用户")
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @TableId(value = "username", type = IdType.INPUT)
    @ApiModelProperty(value = "用户名")
    private long username;

    @TableField(value = "password")
    @ApiModelProperty(value = "密码")
    private String password;

    @TableField(value = "user_type")
    @ApiModelProperty(value = "用户类型")
    private int userType;
}

