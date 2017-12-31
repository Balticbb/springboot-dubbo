package com.product.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.silver.LoginService;

/**
 * Created by SliverZhang on 2017/12/31.
 */

@Service(version = "1.0")
public class LoginServiceImpl implements LoginService {
    @Override
    public Boolean login() {
        System.out.println("消费者进来了");
        return true;
    }
}
