package com.example.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yushengma
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboApplication.class, args);
		System.out.println("====================================");
	}
}
