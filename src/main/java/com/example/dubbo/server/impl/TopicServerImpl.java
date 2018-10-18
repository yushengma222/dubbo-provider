package com.example.dubbo.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.server.TopicServer;
import com.example.dubbo.vo.Topic;
import org.springframework.stereotype.Component;

/**
 * @author yushengma
 */
@Service
@Component
public class TopicServerImpl implements TopicServer {
    @Override
    public Topic getTopic(String name) {
        return new Topic(name, "3", "loanorder");
    }
}
