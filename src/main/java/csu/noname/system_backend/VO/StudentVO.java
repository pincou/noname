package csu.noname.system_backend.VO;

import csu.noname.system_backend.entity.Course;
import csu.noname.system_backend.entity.Score;
import lombok.Data;

import java.util.List;
@Data
public class StudentVO {
    private long studentId;
    private String studentName;
    private String department;
    private String studentMajor;
    private int studentGradeNo;
    private int classNo;

    private List<Integer> student_courseIDs;
    private List<Score> student_scores;

}
