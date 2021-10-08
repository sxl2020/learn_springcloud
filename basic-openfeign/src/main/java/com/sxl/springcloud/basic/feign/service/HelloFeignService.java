package com.sxl.springcloud.basic.feign.service;

import com.sxl.springcloud.basic.feign.config.HelloFeignServiceConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.sxl.springcloud.basic.feign.config.*;

@FeignClient(name = "github-client", url = "https://api.github.com", configuration = HelloFeignServiceConfig.class)
public interface HelloFeignService {

    /**
     * content:
     * {
     *  "message":"Validation Failed",
     *  "errors":[{"resource":"Search","field":"q","code":"missing"}],
     *  "documentation_url":"https://developer.github.com/v3/search"
     *  }
     *
     * @param queryStr
     * @return
     */
    @GetMapping(value = "/search/repositories")
    String searchRepo(@RequestParam("q") String queryStr);

}

