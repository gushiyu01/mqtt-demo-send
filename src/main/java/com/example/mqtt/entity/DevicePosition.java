package com.example.mqtt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (DevicePosition)实体类
 *
 * @author makejava
 * @since 2020-05-29 11:15:05
 */
public class DevicePosition implements Serializable {
    private static final long serialVersionUID = -40186564297407123L;
    /**
    * 主键id
    */
    private Long id;
    /**
    * 设备id
    */
    private String deviceId;
    /**
    * 经度
    */
    private Double lng;
    /**
    * 纬度
    */
    private Double lat;
    /**
    * 记录时间
    */
    private Date recordTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

}