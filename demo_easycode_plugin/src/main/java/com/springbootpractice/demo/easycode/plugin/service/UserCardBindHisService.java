package com.springbootpractice.demo.easycode.plugin.service;

import com.springbootpractice.demo.easycode.plugin.entity.UserCardBindHis;
import java.util.List;

/**
 * (UserCardBindHis)表服务接口
 *
 * @author carter
 * @since 2020-02-14 22:01:32
 */
public interface UserCardBindHisService {

    /**
     * 通过ID查询单条数据
     *
     * @param logId 主键
     * @return 实例对象
     */
    UserCardBindHis queryById(Integer logId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserCardBindHis> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userCardBindHis 实例对象
     * @return 实例对象
     */
    UserCardBindHis insert(UserCardBindHis userCardBindHis);

    /**
     * 修改数据
     *
     * @param userCardBindHis 实例对象
     * @return 实例对象
     */
    UserCardBindHis update(UserCardBindHis userCardBindHis);

    /**
     * 通过主键删除数据
     *
     * @param logId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer logId);

}