package com.example.mqtt.service;

import com.example.mqtt.entity.DevicePosition;
import java.util.List;

/**
 * (DevicePosition)表服务接口
 *
 * @author makejava
 * @since 2020-05-29 11:15:07
 */
public interface DevicePositionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DevicePosition queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DevicePosition> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param devicePosition 实例对象
     * @return 实例对象
     */
    DevicePosition insert(DevicePosition devicePosition);

    /**
     * 修改数据
     *
     * @param devicePosition 实例对象
     * @return 实例对象
     */
    DevicePosition update(DevicePosition devicePosition);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}