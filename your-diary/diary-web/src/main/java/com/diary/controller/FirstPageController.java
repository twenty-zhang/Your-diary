package com.diary.controller;

import org.diary.dao.CityMapper;
import org.diary.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Twenty
 * @CreateDate 2019年2月11日
 *
 */
@Controller
public class FirstPageController {
	@Autowired
	private CityMapper cityMapper;
	
	/**
	 * 
	 * @author Twenty
	 * @CreateDate 2019年2月11日
	 */
	@RequestMapping("/")
	public String Firstpage() {
		User findByState = cityMapper.findByState(1);
		System.out.println(findByState);
		return "default.html";
	}
}
