package csu.noname.system_backend.service;


import csu.noname.system_backend.VO.ScoreVO;
import csu.noname.system_backend.VO.StudentVO;

import java.util.List;

/**
 * (Student)表服务接口
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
public interface StudentService {
    public StudentVO getStudentByID(long studentID);
    public List<ScoreVO> getStudentAllScore(long studentID);
    public List<Integer> getStudentAllCourseID(long studentID);
    public double getTotalAVGGrade(long studentID);

}
