package csu.noname.system_backend.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import csu.noname.system_backend.entity.Course;
import csu.noname.system_backend.entity.Teacher;
import csu.noname.system_backend.persistence.CourseMapper;
import csu.noname.system_backend.persistence.TeacherMapper;
import csu.noname.system_backend.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * (Course)表服务实现类
 *
 * @author makejava
 * @since 2024-07-11 20:25:48
 */
@Slf4j
@Transactional
@Service("courseService")
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

}
