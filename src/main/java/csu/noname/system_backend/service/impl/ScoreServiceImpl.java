package csu.noname.system_backend.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import csu.noname.system_backend.entity.Score;
import csu.noname.system_backend.entity.Teacher;
import csu.noname.system_backend.persistence.ScoreMapper;
import csu.noname.system_backend.persistence.TeacherMapper;
import csu.noname.system_backend.service.ScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;


/**
 * (Score)表服务实现类
 *
 * @author makejava
 * @since 2024-07-11 20:36:59
 */@Slf4j
@Transactional
@Service("scoreService")
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score> implements ScoreService {


}
