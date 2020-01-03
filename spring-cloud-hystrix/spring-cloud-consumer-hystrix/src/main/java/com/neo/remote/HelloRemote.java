package com.neo.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by summer on 2017/5/11.
 */
@FeignClient(name= "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    /**
     * 当指定服务不可用就会调用的方法
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);

}
