package csu.noname.system_backend.service;

import csu.noname.system_backend.entity.Submit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Submit)表服务接口
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
public interface SubmitService {

    /**
     * 通过ID查询单条数据
     *
     * @param submitId 主键
     * @return 实例对象
     */
    Submit queryById(Integer submitId);

    /**
     * 分页查询
     *
     * @param submit 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Submit> queryByPage(Submit submit, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param submit 实例对象
     * @return 实例对象
     */
    Submit insert(Submit submit);

    /**
     * 修改数据
     *
     * @param submit 实例对象
     * @return 实例对象
     */
    Submit update(Submit submit);

    /**
     * 通过主键删除数据
     *
     * @param submitId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer submitId);

}
