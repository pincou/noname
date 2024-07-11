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
 * (StuCour)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
@Data
@Entity
@TableName("stu_cour")
@ApiModel(value = "学生课程")
public class StuCour implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableField(value = "course_id")
    @ApiModelProperty(value = "课程ID")
    private int courseId;

    @TableField(value = "student_id")
    @ApiModelProperty(value = "学生ID")
    private long studentId;
}

