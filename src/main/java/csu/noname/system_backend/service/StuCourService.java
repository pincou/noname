package csu.noname.system_backend.service;

import csu.noname.system_backend.entity.StuCour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (StuCour)表服务接口
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
public interface StuCourService {

    /**
     * 通过ID查询单条数据
     *
     * @param studentId 主键
     * @return 实例对象
     */
    StuCour queryById(Long studentId);

    /**
     * 分页查询
     *
     * @param stuCour 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<StuCour> queryByPage(StuCour stuCour, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param stuCour 实例对象
     * @return 实例对象
     */
    StuCour insert(StuCour stuCour);

    /**
     * 修改数据
     *
     * @param stuCour 实例对象
     * @return 实例对象
     */
    StuCour update(StuCour stuCour);

    /**
     * 通过主键删除数据
     *
     * @param studentId 主键
     * @return 是否成功
     */
    boolean deleteById(Long studentId);

}
