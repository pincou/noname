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
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @TableId(value = "course_id", type = IdType.INPUT)
    @ApiModelProperty(value = "课程号")
    private Integer courseId;

    @Id
    @TableId(value = "student_id", type = IdType.INPUT)
    @ApiModelProperty(value = "学生号")
    private Integer studentId;
}

