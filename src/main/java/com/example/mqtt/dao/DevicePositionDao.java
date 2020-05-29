package com.example.mqtt.dao;

import com.example.mqtt.entity.DevicePosition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (DevicePosition)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-29 11:15:06
 */
@Mapper
public interface DevicePositionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DevicePosition queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DevicePosition> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param devicePosition 实例对象
     * @return 对象列表
     */
    List<DevicePosition> queryAll(DevicePosition devicePosition);

    /**
     * 新增数据
     *
     * @param devicePosition 实例对象
     * @return 影响行数
     */
    int insert(DevicePosition devicePosition);

    /**
     * 修改数据
     *
     * @param devicePosition 实例对象
     * @return 影响行数
     */
    int update(DevicePosition devicePosition);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}