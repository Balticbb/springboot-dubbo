package com.contoller;

import com.consumer.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SliverZhang on 2017/12/31.
 */
@RestController
public class Api {
    @Autowired
    private Consumer consumer;
    @RequestMapping("/testDubbo")
    public Boolean testDubbo(){

        return consumer.loginConsume();
    }

}
