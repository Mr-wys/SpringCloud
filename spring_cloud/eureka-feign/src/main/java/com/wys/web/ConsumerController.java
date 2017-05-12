package com.wys.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wys.service.ComputeClient;
/*
 * 在web层中调用上面定义的ComputeClient
 * */
@RestController
public class ConsumerController {
	@Autowired
	ComputeClient computeClient;
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public Integer add(){
		return computeClient.add(10, 20);
	}
}
