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
 * (Teacher)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
@Data
@Entity
@TableName("teacher")
@ApiModel(value = "教师")
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @TableId(value = "teacher_id", type = IdType.INPUT)
    @ApiModelProperty(value = "教师号")
    private long teacherId;

    @TableField(value = "teacher_name")
    @ApiModelProperty(value = "教师姓名")
    private String teacherName;

    @TableField(value = "department")
    @ApiModelProperty(value = "所属部门")
    private String department;
}

