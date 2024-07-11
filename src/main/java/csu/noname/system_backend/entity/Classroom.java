package csu.noname.system_backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * (Classroom)实体类
 *
 * @author zyh
 * @since 2024-07-11 13:12:06
 */
@Data
@TableName("classroom")
@ApiModel(value = "教室")
public class Classroom implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @MppMultiId
    @TableField(value = "classroom")
    @ApiModelProperty(value = "教室号")
    private Integer classroomNo;
    @MppMultiId
    @TableField(value = "site_id")
    @ApiModelProperty(value = "所在楼栋号")
    private String site;
    @TableField(value = "state")
    @ApiModelProperty(value = "预约状态")
    private Integer state;
    @TableField(value = "capacity")
    @ApiModelProperty(value = "教室容量")
    private Integer capacity;
    @TableField("booked_by")
    @ApiModelProperty(value = "预约用户")
    private String bookedBy;
}

