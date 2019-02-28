package com.diary.spring.entrance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目入口类
 * @author Twenty
 * @CreateDate 2019年2月9日
 */
@SpringBootApplication(scanBasePackages="com.diary")
@MapperScan("org.diary.dao")
public class URDiaryEntrance{
	
	/**
	 * @param args
	 * @author Twenty
	 * @CreateDate 2019年2月9日
	 */
	public static void main(String[] args) {
		SpringApplication.run(URDiaryEntrance.class);
	}
	
}
