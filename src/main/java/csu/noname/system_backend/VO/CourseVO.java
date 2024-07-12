package csu.noname.system_backend.VO;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CourseVO {
    private Integer courseId;
    private String courseName;
    private double courseCredit;
    private int courseTerm;
    private String courseMajor;
    private int courseGradeNo;
    private int courseContain;
    private int courseLeft;
    private int chosen;
    private String site;
    private int classroomNo;
    private int startWeek;
    private int endWeek;
}
