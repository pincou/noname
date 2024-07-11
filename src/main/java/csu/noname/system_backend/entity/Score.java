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
 * (Score)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
@Data
@Entity
@TableName("score")
@ApiModel(value = "分数")
public class Score implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @TableId(value = "score_id", type = IdType.INPUT)
    @ApiModelProperty(value = "分数号")
    private Integer scoreId;

    @TableField(value = "course_id")
    @ApiModelProperty(value = "课程ID")
    private int courseId;

    @TableField(value = "student_id")
    @ApiModelProperty(value = "学生ID")
    private long studentId;

    @TableField(value = "total_score")
    @ApiModelProperty(value = "总成绩")
    private double totalScore;

    @TableField(value = "user_score")
    @ApiModelProperty(value = "用户成绩")
    private double userScore;

    @TableField(value = "final_score")
    @ApiModelProperty(value = "最终成绩")
    private double finalScore;

    @TableField(value = "usual_percentage")
    @ApiModelProperty(value = "平时成绩百分比")
    private double usualPercentage;

    @TableField(value = "final_percentage")
    @ApiModelProperty(value = "最终成绩百分比")
    private double finalPercentage;
}

