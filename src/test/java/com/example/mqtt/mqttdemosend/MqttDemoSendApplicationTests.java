package com.example.mqtt.mqttdemosend;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MqttDemoSendApplicationTests {

    @Test
    public void contextLoads() {
        Map<String, Object> s = new HashMap<> ();
        s.put ("name", "谷世宇");
        s.put ("id", 1);
        System.out.println (JSONObject.toJSONString (s));
    }

}
