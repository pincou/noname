package csu.noname.system_backend.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import csu.noname.system_backend.entity.Classroom;
import csu.noname.system_backend.persistence.ClassroomMapper;
import csu.noname.system_backend.service.ClassroomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * (Classroom)表服务实现类
 *
 * @author makejava
 * @since 2024-07-11 20:25:48
 */
@Slf4j
@Transactional
@Service("classroomService")
public class ClassroomServiceImpl extends ServiceImpl<ClassroomMapper, Classroom> implements ClassroomService {
  }
