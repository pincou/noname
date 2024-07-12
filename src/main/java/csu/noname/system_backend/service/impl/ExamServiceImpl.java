package csu.noname.system_backend.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import csu.noname.system_backend.entity.Exam;
import csu.noname.system_backend.entity.Teacher;
import csu.noname.system_backend.persistence.ExamMapper;
import csu.noname.system_backend.persistence.TeacherMapper;
import csu.noname.system_backend.service.ExamService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * (Exam)表服务实现类
 *
 * @author makejava
 * @since 2024-07-11 20:25:48
 */
@Slf4j
@Transactional
@Service("examService")
public class ExamServiceImpl extends ServiceImpl<ExamMapper, Exam> implements ExamService {
}
