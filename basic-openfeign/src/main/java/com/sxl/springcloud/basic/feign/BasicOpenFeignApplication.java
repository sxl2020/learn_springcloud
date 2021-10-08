package com.sxl.springcloud.basic.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * openFeign启动类
 *
 * @author suqiancheng
 * @create 2021年10月08日 下午10:29
 */
@SpringBootApplication
@EnableFeignClients
public class BasicOpenFeignApplication {

    public static void main(String[] args){
        SpringApplication.run(BasicOpenFeignApplication.class,args);
    }
}
