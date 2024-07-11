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
 * (Course)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:12:07
 */
@Data
@Entity
@TableName("course")
@ApiModel(value = "课程")
public class Course implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @TableId(value = "course_id", type = IdType.INPUT)
    @ApiModelProperty(value = "课程号")
    private Integer courseId;

    @TableField(value = "course_name")
    @ApiModelProperty(value = "课程名称")
    private String courseName;

    @TableField(value = "course_credit")
    @ApiModelProperty(value = "课程学分")
    private double courseCredit;

    @TableField(value = "course_term")
    @ApiModelProperty(value = "课程学期")
    private int courseTerm;

    @TableField(value = "course_major")
    @ApiModelProperty(value = "课程专业")
    private String courseMajor;

    @TableField(value = "course_grade_no")
    @ApiModelProperty(value = "课程年级编号")
    private int courseGradeNo;

    @TableField(value = "course_contain")
    @ApiModelProperty(value = "课程容量")
    private int courseContain;

    @TableField(value = "course_left")
    @ApiModelProperty(value = "课程剩余名额")
    private int courseLeft;

    @TableField(value = "chosen")
    @ApiModelProperty(value = "已选人数")
    private int chosen;

    @TableField(value = "site")
    @ApiModelProperty(value = "所在楼栋")
    private String site;

    @TableField(value = "classroom_no")
    @ApiModelProperty(value = "教室编号")
    private int classroomNo;

    @TableField(value = "start_week")
    @ApiModelProperty(value = "课程开始周")
    private int startWeek;

    @TableField(value = "end_week")
    @ApiModelProperty(value = "课程结束周")
    private int endWeek;
}

