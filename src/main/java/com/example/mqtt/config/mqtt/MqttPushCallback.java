package com.example.mqtt.config.mqtt;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: Create by gsy
 * @Date: Create in 2020/5/27 9:54
 * @Description: 回调函数
 */
public class MqttPushCallback implements MqttCallback{

    private static final Logger log = LoggerFactory.getLogger(MqttPushCallback.class);

    @Override
    public void connectionLost(Throwable cause) {
        log.info("断开连接，建议重连" + this);
        //断开连接，建议重连
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {
        log.info(token.isComplete() + "");
    }

    @Override
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        log.info("Topic: " + topic);
        log.info("Message: " + new String(message.getPayload()));
    }
}
