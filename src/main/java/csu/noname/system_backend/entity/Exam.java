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
 * (Exam)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:12:07
 */
@Data
@Entity
@TableName("exam")
@ApiModel(value = "考试")
public class Exam implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @TableId(value = "course_id", type = IdType.INPUT)
    @ApiModelProperty(value = "课程号")
    private Integer courseId;

    @TableField(value = "course_name")
    @ApiModelProperty(value = "课程名称")
    private String courseName;

    @TableField(value = "data")
    @ApiModelProperty(value = "考试日期")
    private String data;

    @TableField(value = "time")
    @ApiModelProperty(value = "考试时间")
    private String time;

    @TableField(value = "site")
    @ApiModelProperty(value = "考试地点")
    private String site;

    @TableField(value = "type")
    @ApiModelProperty(value = "考试类型")
    private int type;
}

