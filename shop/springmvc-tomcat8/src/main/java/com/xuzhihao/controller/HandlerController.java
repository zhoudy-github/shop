package com.xuzhihao.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

//controller定义的方式 有两种类型三种实现
// 2种类型 BeanName 和 @contrller
// 3种实现： @Controller、implements Controller/HttpRequestHandler
@Component("/json3")
public class HandlerController implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("json3");
	}
}
