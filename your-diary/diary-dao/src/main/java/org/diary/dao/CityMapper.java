package org.diary.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.diary.entity.User;

/**
 * @author Twenty
 * @CreateDate 2019年2月27日
 *
 */
public interface CityMapper {
	
	@Select("SELECT * FROM t_user WHERE user_id = #{userID}")
	User findByState(@Param("userID") int userID);

}
