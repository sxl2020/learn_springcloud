package com.sxl.springcloud.basic.feign.controller;

import com.sxl.springcloud.basic.feign.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Feign控制类
 *
 * @author suqiancheng
 * @create 2021年10月08日 下午10:26
 */
@RestController
public class HelloFeignController {

    @Autowired
    private HelloFeignService helloFeignService;

    @GetMapping(value = "/search/github")
    public String searchGithubRepoByStr(@RequestParam("searchStr") String searchStr) {
        return helloFeignService.searchRepo(searchStr);
    }

}
