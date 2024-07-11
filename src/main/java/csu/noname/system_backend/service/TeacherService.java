package csu.noname.system_backend.service;

import csu.noname.system_backend.entity.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Teacher)表服务接口
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
public interface TeacherService {

    /**
     * 通过ID查询单条数据
     *
     * @param teacherId 主键
     * @return 实例对象
     */
    Teacher queryById(Long teacherId);

    /**
     * 分页查询
     *
     * @param teacher 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Teacher> queryByPage(Teacher teacher, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    Teacher insert(Teacher teacher);

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    Teacher update(Teacher teacher);

    /**
     * 通过主键删除数据
     *
     * @param teacherId 主键
     * @return 是否成功
     */
    boolean deleteById(Long teacherId);

}
