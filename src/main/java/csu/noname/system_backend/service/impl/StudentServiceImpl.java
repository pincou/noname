package csu.noname.system_backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import csu.noname.system_backend.VO.CourseVO;
import csu.noname.system_backend.VO.ScoreVO;
import csu.noname.system_backend.VO.StudentVO;
import csu.noname.system_backend.entity.Course;
import csu.noname.system_backend.entity.Score;
import csu.noname.system_backend.entity.Student;
import csu.noname.system_backend.persistence.CourseMapper;
import csu.noname.system_backend.persistence.ScoreMapper;
import csu.noname.system_backend.persistence.StudentMapper;
import csu.noname.system_backend.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2024-07-11 20:36:59
 */
@Slf4j
@Transactional
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    CourseMapper courseMapper;
    @Autowired
    ScoreMapper scoreMapper;
    @Override
    public StudentVO getStudentByID(long studentID) {
        QueryWrapper<Student> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("student_id",studentID);
        Student student= studentMapper.selectOne(queryWrapper);
        if (student!=null){
            StudentVO studentVO=new StudentVO();
            studentVO.setStudentId(studentID);
            studentVO.setStudentName(student.getStudentName());
            studentVO.setDepartment(student.getDepartment());
            studentVO.setStudentMajor(student.getStudentMajor());
            studentVO.setStudentGradeNo(student.getStudentGradeNo());
            studentVO.setClassNo(student.getClassNo());
            List<Score> scores=scoreMapper.selectScoresByStudentID(studentID);
            studentVO.setStudent_scores(scores);
            List<Integer> courseIDs=getStudentAllCourseID(studentID);
            studentVO.setStudent_courseIDs(courseIDs);
            return studentVO;
        }
        else return null;
    }

    @Override
    public List<ScoreVO> getStudentAllScore(long studentID) {
        List<Score> scores=scoreMapper.selectScoresByStudentID(studentID);
        List<ScoreVO> scoreVOS=new ArrayList<>();
        ScoreVO scoreVO=new ScoreVO();
        if (scores.size()!=0){
            for (Score score : scores) {
                scoreVO.setStudentId(score.getStudentId());
                scoreVO.setCourseId(score.getCourseId());
                scoreVO.setTotalScore(score.getTotalScore());
                scoreVO.setUserScore(score.getUserScore());
                scoreVO.setFinalScore(score.getFinalScore());
                scoreVO.setUsualPercentage(score.getUsualPercentage());
                scoreVO.setFinalPercentage(score.getFinalPercentage());
                scoreVOS.add(scoreVO);
            }
            return scoreVOS;
        }
        else return null;
    }

    @Override
    public List<Integer> getStudentAllCourseID(long studentID) {
        QueryWrapper<Score> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("student_id",studentID);
        List<Score> scores=scoreMapper.selectList(queryWrapper);
        List<Integer> courseIDs=new ArrayList<>();
        if (scores!=null) {
            for (Score score : scores) {
                courseIDs.add(score.getCourseId());
            }
            return courseIDs;
        }
        else return null;
    }

    @Override
    public double getTotalAVGGrade(long studentID) {
        List<ScoreVO> scoreVOS= getStudentAllScore(studentID);
        QueryWrapper<Course> queryWrapper=new QueryWrapper<>();
        Course  course=new Course();
        double credit=0;
        double total=0;
        double TotalCredit=0;
        for (ScoreVO scoreVO : scoreVOS) {
            queryWrapper.eq("course_id", scoreVO.getCourseId());
            course = courseMapper.selectOne(queryWrapper);
            credit = course.getCourseCredit();
            TotalCredit += credit;
            total = scoreVO.getFinalScore() * credit;
        }
        total=total/TotalCredit;
        return total;
    }
}
