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
 * (Student)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
@Data
@Entity
@TableName("student")
@ApiModel(value = "学生")
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @TableId(value = "student_id", type = IdType.INPUT)
    @ApiModelProperty(value = "学号")
    private long studentId;

    @TableField(value = "student_name")
    @ApiModelProperty(value = "学生姓名")
    private String studentName;

    @TableField(value = "department")
    @ApiModelProperty(value = "所在院系")
    private String department;

    @TableField(value = "student_major")
    @ApiModelProperty(value = "学生专业")
    private String studentMajor;

    @TableField(value = "student_grade_no")
    @ApiModelProperty(value = "所在年级")
    private int studentGradeNo;

    @TableField(value = "class_no")
    @ApiModelProperty(value = "班级编号")
    private int classNo;
}

