package csu.noname.system_backend.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Entity;
import lombok.Data;

import java.io.Serializable;

/**
 * (TeaCour)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
@Data
@Entity
@TableName("tea_cour")
@ApiModel(value = "教师课程")
public class TeaCour implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableField(value = "course_id")
    @ApiModelProperty(value = "课程ID")
    private int courseId;

    @TableField(value = "teacher_id")
    @ApiModelProperty(value = "教师ID")
    private long teacherId;
}

