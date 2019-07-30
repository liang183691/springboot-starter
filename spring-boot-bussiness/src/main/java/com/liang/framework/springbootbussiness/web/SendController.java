package com.liang.framework.springbootbussiness.web;

import com.liang.framework.springmqstarter.rabbitmq.FirstSender;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "send")
public class SendController {

    @Autowired
    FirstSender firstSender;

    @GetMapping("mq")
    public void send(){
            firstSender.send("123","ceshi");
    }

    @RequestMapping("hi")
    public String hello(){
        return "hello";
    }

    @RabbitListener(queues = {"first-queue","second-queue"}, containerFactory = "rabbitListenerContainerFactory")
    public void handleMessage(String message) throws Exception {
        // 处理消息
        System.out.println("FirstConsumer {} handleMessage :"+message);
    }
}
