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

import java.io.Serializable;

/**
 * (Classroom)实体类
 *
 * @author zyh
 * @since 2024-07-11 13:12:06
 */
@Data
@Entity
@TableName("classroom")
@ApiModel(value = "教室")
public class Classroom implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @TableId(value = "classroom_no",type = IdType.INPUT)
    @ApiModelProperty(value = "教室号")
    private Integer classroomNo;

    @TableField(value = "state")
    @ApiModelProperty(value = "预约状态")
    private int state;

    @TableField(value = "capacity")
    @ApiModelProperty(value = "教室容量")
    private int capacity;

    @TableField("booked_by")
    @ApiModelProperty(value = "预约用户")
    private String bookedBy;

    @TableField(value = "site_id")
    @ApiModelProperty(value = "所在楼栋号")
    private int siteId;

}

