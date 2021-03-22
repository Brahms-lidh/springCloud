package com.lidh.busi;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController extends BusinessBaseAction{
	
	/**
	 *  业务层交易入口
	 */
	@PostMapping(value = "/api/business")
	@ResponseBody
	public String doService(HttpServletRequest request, HttpServletResponse response) {
		return super.doService(request, response);
	}

}
