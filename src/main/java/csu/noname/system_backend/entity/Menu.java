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
 * (Menu)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:22
 */
@Data
@Entity
@TableName("menu")
@ApiModel(value = "菜单")
public class Menu implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @TableId(value = "menu_id", type = IdType.INPUT)
    @ApiModelProperty(value = "菜单号")
    private Integer menuId;

    @TableField(value = "title")
    @ApiModelProperty(value = "标题")
    private String title;

    @TableField(value = "path")
    @ApiModelProperty(value = "路径")
    private String path;

    @TableField(value = "icon")
    @ApiModelProperty(value = "图标")
    private String icon;

    @TableField(value = "user_type")
    @ApiModelProperty(value = "用户类型")
    private int userType;

    @TableField(value = "parent_id")
    @ApiModelProperty(value = "父级ID")
    private int parentId;
}

