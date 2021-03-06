package com.springbootpractice.demo.easycode.plugin.service;

import com.springbootpractice.demo.easycode.plugin.entity.FlywaySchemaHistory;
import java.util.List;

/**
 * (FlywaySchemaHistory)表服务接口
 *
 * @author carter
 * @since 2020-02-14 22:01:30
 */
public interface FlywaySchemaHistoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param installedRank 主键
     * @return 实例对象
     */
    FlywaySchemaHistory queryById(Integer installedRank);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<FlywaySchemaHistory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param flywaySchemaHistory 实例对象
     * @return 实例对象
     */
    FlywaySchemaHistory insert(FlywaySchemaHistory flywaySchemaHistory);

    /**
     * 修改数据
     *
     * @param flywaySchemaHistory 实例对象
     * @return 实例对象
     */
    FlywaySchemaHistory update(FlywaySchemaHistory flywaySchemaHistory);

    /**
     * 通过主键删除数据
     *
     * @param installedRank 主键
     * @return 是否成功
     */
    boolean deleteById(Integer installedRank);

}