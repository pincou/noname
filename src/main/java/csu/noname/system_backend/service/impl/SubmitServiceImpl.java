package csu.noname.system_backend.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import csu.noname.system_backend.entity.Submit;
import csu.noname.system_backend.persistence.SubmitMapper;
import csu.noname.system_backend.service.SubmitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * (Submit)表服务实现类
 *
 * @author makejava
 * @since 2024-07-11 20:36:59
 */
@Slf4j
@Transactional
@Service("submitService")
public class SubmitServiceImpl extends ServiceImpl<SubmitMapper, Submit> implements SubmitService {
}
