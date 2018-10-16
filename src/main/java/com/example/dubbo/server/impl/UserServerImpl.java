package com.example.dubbo.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.server.UserServer;
import com.example.dubbo.vo.User;
import org.springframework.stereotype.Component;

/**
 * @author yushengma
 */
@Service
@Component
public class UserServerImpl implements UserServer {
    @Override
    public User getByName(String name) {
        return new User(name, 20, "man");
    }
}
