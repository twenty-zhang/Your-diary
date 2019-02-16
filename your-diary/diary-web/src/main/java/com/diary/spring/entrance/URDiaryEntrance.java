package com.diary.spring.entrance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 项目入口类
 * @author Twenty
 * @CreateDate 2019年2月9日
 */
@SpringBootApplication
@ComponentScan("com.diary.spring.config")
public class URDiaryEntrance {

	/**
	 * @param args
	 * @author Twenty
	 * @CreateDate 2019年2月9日
	 */
	public static void main(String[] args) {
		SpringApplication.run(URDiaryEntrance.class);
	}
}
