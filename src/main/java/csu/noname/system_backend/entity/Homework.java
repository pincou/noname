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
 * (Homework)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:12:07
 */
@Data
@Entity
@TableName("homework")
@ApiModel(value = "作业")
public class Homework implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @TableId(value = "homework_id", type = IdType.INPUT)
    @ApiModelProperty(value = "作业号")
    private Integer homeworkId;

    @TableField(value = "course_id")
    @ApiModelProperty(value = "课程ID")
    private int courseId;

    @TableField(value = "teacher_id")
    @ApiModelProperty(value = "教师ID")
    private long teacherId;

    @TableField(value = "homework_type")
    @ApiModelProperty(value = "作业类型")
    private int homeworkType;

    @TableField(value = "homework_title")
    @ApiModelProperty(value = "作业标题")
    private String homeworkTitle;

    @TableField(value = "content")
    @ApiModelProperty(value = "作业内容")
    private String content;

    @TableField(value = "teacher_file")
    @ApiModelProperty(value = "教师文件")
    private String teacherFile;

}

