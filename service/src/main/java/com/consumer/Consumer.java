package com.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.silver.LoginService;
import org.springframework.stereotype.Service;

/**
 * Created by SliverZhang on 2017/12/31.
 */
@Service
public class Consumer {
    @Reference(version = "1.0")
    private LoginService loginService;

    public Boolean loginConsume(){

        return loginService.login();
    }
}
