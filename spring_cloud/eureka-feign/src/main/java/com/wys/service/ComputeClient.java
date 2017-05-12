package com.wys.service;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * 定义compute-service服务的接口
 * */
@FeignClient("compute-service")  //使用该注解来绑定该接口对应compute-service服务
public interface ComputeClient {
	@RequestMapping(method = RequestMethod.GET, value = "/add")
	Integer add(@RequestParam(value="a") Integer a,@RequestParam(value="b") Integer b);
}
