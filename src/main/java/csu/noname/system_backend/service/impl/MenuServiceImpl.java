package csu.noname.system_backend.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import csu.noname.system_backend.entity.Menu;
import csu.noname.system_backend.entity.Teacher;
import csu.noname.system_backend.persistence.MenuMapper;
import csu.noname.system_backend.persistence.TeacherMapper;
import csu.noname.system_backend.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * (Menu)表服务实现类
 *
 * @author makejava
 * @since 2024-07-11 20:36:58
 */
@Slf4j
@Transactional
@Service("menuService")
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {}
