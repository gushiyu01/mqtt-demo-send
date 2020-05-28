package com.example.mqtt.mqttdemosend.controller;


import com.example.mqtt.mqttdemosend.service.MqttGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Create by gsy
 * @Date: Create in 2020/5/26 16:05
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private MqttGateway mqttGateway;

    @GetMapping("/sendMqtt.do")
    public String sendMqtt(String  sendData){
        mqttGateway.sendToMqtt("{\"name\":\"谷世宇\",\"id\":1}","hello");
        return "OK";
    }

}
