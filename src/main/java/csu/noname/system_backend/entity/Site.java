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
 * (Score)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
@Data
@Entity
@TableName("site")
@ApiModel(value = "所在楼栋")
public class Site implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @TableId(value = "site_id", type = IdType.INPUT)
    @ApiModelProperty(value = "所在楼栋号")
    private Integer siteId;

    @TableField(value = "site_name")
    @ApiModelProperty(value = "所在楼栋名称")
    private String siteName;

    @TableField(value = "site_location")
    @ApiModelProperty(value = "所在楼栋位置")
    private String siteLocation;
}
