package com.diary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Twenty
 * @CreateDate 2019年2月11日
 *
 */
@Controller
public class FirstPageController {
	
	/**
	 * 
	 * @author Twenty
	 * @CreateDate 2019年2月11日
	 */
	@RequestMapping("/")
	public String Firstpage() {
		return "forward:/default.html";
	}
}
