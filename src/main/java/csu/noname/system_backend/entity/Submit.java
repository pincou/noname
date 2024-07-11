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
 * (Submit)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
@Data
@Entity
@TableName("submit")
@ApiModel(value = "作业提交")
public class Submit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @TableId(value = "submit_id", type = IdType.INPUT)
    @ApiModelProperty(value = "作业提交号")
    private Integer submitId;

    @TableField(value = "student_id")
    @ApiModelProperty(value = "学生ID")
    private long studentId;

    @TableField(value = "course_id")
    @ApiModelProperty(value = "课程ID")
    private int courseId;

    @TableField(value = "student_file")
    @ApiModelProperty(value = "学生文件")
    private String studentFile;

    @TableField(value = "state")
    @ApiModelProperty(value = "状态")
    private int state;

    @TableField(value = "homework_id")
    @ApiModelProperty(value = "作业ID")
    private int homeworkId;
}

