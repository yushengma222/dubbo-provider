package com.example.dubbo.server;

import com.example.dubbo.vo.Topic;

/**
 * @author yushengma
 */
public interface TopicServer {
    Topic getTopic(String name);
}
