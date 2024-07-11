package csu.noname.system_backend.service;

import csu.noname.system_backend.entity.TeaCour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TeaCour)表服务接口
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
public interface TeaCourService {

    /**
     * 通过ID查询单条数据
     *
     * @param teacherId 主键
     * @return 实例对象
     */
    TeaCour queryById(Long teacherId);

    /**
     * 分页查询
     *
     * @param teaCour 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TeaCour> queryByPage(TeaCour teaCour, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param teaCour 实例对象
     * @return 实例对象
     */
    TeaCour insert(TeaCour teaCour);

    /**
     * 修改数据
     *
     * @param teaCour 实例对象
     * @return 实例对象
     */
    TeaCour update(TeaCour teaCour);

    /**
     * 通过主键删除数据
     *
     * @param teacherId 主键
     * @return 是否成功
     */
    boolean deleteById(Long teacherId);

}
