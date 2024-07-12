package csu.noname.system_backend.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import csu.noname.system_backend.entity.Site;
import csu.noname.system_backend.entity.Teacher;
import csu.noname.system_backend.persistence.SiteMapper;
import csu.noname.system_backend.persistence.TeacherMapper;
import csu.noname.system_backend.service.SiteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * (Site)表服务实现类
 *
 * @author makejava
 * @since 2024-07-11 20:36:59
 */
@Slf4j
@Transactional
@Service("siteService")
public class SiteServiceImpl extends ServiceImpl<SiteMapper, Site> implements SiteService {
}
