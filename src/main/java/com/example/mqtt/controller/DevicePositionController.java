package com.example.mqtt.controller;

import com.example.mqtt.entity.DevicePosition;
import com.example.mqtt.service.DevicePositionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DevicePosition)表控制层
 *
 * @author makejava
 * @since 2020-05-29 11:15:09
 */
@RestController
@RequestMapping("devicePosition")
public class DevicePositionController {
    /**
     * 服务对象
     */
    @Resource
    private DevicePositionService devicePositionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DevicePosition selectOne(Long id) {
        return this.devicePositionService.queryById(id);
    }

}