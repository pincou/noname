package csu.noname.system_backend.service.impl;

import csu.noname.system_backend.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
