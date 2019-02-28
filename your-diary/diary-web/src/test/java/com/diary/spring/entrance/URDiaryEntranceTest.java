package com.diary.spring.entrance;

import org.diary.dao.CityMapper;
import org.diary.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Twenty
 * @CreateDate 2019年2月28日
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class URDiaryEntranceTest {
	
	@Autowired
	private CityMapper cityMapper;
	
	@Test
	public void test() {
		User findByState = cityMapper.findByState(1);
		System.out.println(findByState.toString());
	}

}
