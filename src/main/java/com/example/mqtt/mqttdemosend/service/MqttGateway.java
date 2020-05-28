package com.example.mqtt.mqttdemosend.service;


import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;

/**
 * @Author: Create by gsy
 * @Date: Create in 2020/5/26 16:04
 * @Description:
 */
@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
public interface MqttGateway {
    void sendToMqtt(String data,@Header(MqttHeaders.TOPIC) String topic);

}
