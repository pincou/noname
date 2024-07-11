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

    @Id
    @TableId(value = "course_id", type = IdType.INPUT)
    @ApiModelProperty(value = "课程号")
    private Integer courseId;

    @Id
    @TableId(value = "teacher_id", type = IdType.INPUT)
    @ApiModelProperty(value = "教师号")
    private Integer teacherId;
}

