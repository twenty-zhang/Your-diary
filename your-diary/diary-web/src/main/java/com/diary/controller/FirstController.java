package com.diary.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.diary.log.LogCreater;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@RequestMapping("/resp")
	public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setAttribute("message", "it's forword ");
		req.getRequestDispatcher("NewFile.jsp").forward(req, resp);
	}
	
	@RequestMapping(value="/home")
	public String home(){
		LogCreater.getLogger("FirstController").warn("中文错误尝试~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		return "WEB-INF/index.jsp";
	}
	
	@RequestMapping(value="/home/page")
	@ResponseBody
	public ModelAndView goHome(){
		System.out.println("go to the home page!");
		ModelAndView mode = new ModelAndView();
		mode.addObject("name", "zhangsan");
		mode.setViewName("index");
		return mode;
	}

}
