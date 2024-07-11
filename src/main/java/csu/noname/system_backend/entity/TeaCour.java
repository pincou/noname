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
 * (TeaCour)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
@Data
@TableName("tea_cour")
@ApiModel(value = "教师课程")
public class TeaCour implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @MppMultiId
    @TableField(value = "course_id")
    @ApiModelProperty(value = "课程号")
    private Integer courseId;

    @MppMultiId
    @TableField(value = "teacher_id")
    @ApiModelProperty(value = "教师号")
    private Integer teacherId;
}

