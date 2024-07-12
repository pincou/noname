package csu.noname.system_backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import csu.noname.system_backend.entity.TeaCour;
import csu.noname.system_backend.persistence.TeaCourMapper;
import csu.noname.system_backend.service.TeaCourService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * (TeaCour)表服务实现类
 *
 * @author makejava
 * @since 2024-07-11 20:36:59
 */
@Slf4j
@Transactional
@Service("teaCourService")
public class TeaCourServiceImpl extends ServiceImpl<TeaCourMapper, TeaCour> implements TeaCourService {
}
