package com.example.mqtt.controller;

import com.example.mqtt.config.websocket.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Create by gsy
 * @Date: Create in 2020/5/28 16:44
 * @Description:
 */
@Controller
@RequestMapping("/system")
public class SystemController {
    /**
     * 页面请求
     * @param userId
     * @return
     */
    @GetMapping("/index/{userId}")
    public ModelAndView socket(@PathVariable String userId) {
        ModelAndView mav=new ModelAndView("/socket1");
        mav.addObject("userId", userId);
        return mav;
    }

    /**
     * 推送数据接口
     * @param cid
     * @param message
     * @return
     */
    @ResponseBody
    @RequestMapping("/socket/push/{cid}")
    public Map pushToWeb(@PathVariable String cid, String message) {
        Map result = new HashMap ();
        try {
            WebSocketServer.sendInfo(message,cid);
            result.put("code", 200);
            result.put("msg", "success");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
