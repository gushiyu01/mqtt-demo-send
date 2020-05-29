package com.example.mqtt.service.impl;

import com.example.mqtt.entity.DevicePosition;
import com.example.mqtt.dao.DevicePositionDao;
import com.example.mqtt.service.DevicePositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DevicePosition)表服务实现类
 *
 * @author makejava
 * @since 2020-05-29 11:15:07
 */
@Service("devicePositionService")
public class DevicePositionServiceImpl implements DevicePositionService {
    @Resource
    private DevicePositionDao devicePositionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DevicePosition queryById(Long id) {
        return this.devicePositionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DevicePosition> queryAllByLimit(int offset, int limit) {
        return this.devicePositionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param devicePosition 实例对象
     * @return 实例对象
     */
    @Override
    public DevicePosition insert(DevicePosition devicePosition) {
        this.devicePositionDao.insert(devicePosition);
        return devicePosition;
    }

    /**
     * 修改数据
     *
     * @param devicePosition 实例对象
     * @return 实例对象
     */
    @Override
    public DevicePosition update(DevicePosition devicePosition) {
        this.devicePositionDao.update(devicePosition);
        return this.queryById(devicePosition.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.devicePositionDao.deleteById(id) > 0;
    }
}