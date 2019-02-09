package org.diary.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Log工厂
 * 
 * @author Twenty
 * @CreateDate 2019年2月9日
 *
 */
public final class LogCreater {
	
	/**
	 * 获取Log
	 * 
	 * @param className
	 * @return
	 * @author Twenty
	 * @CreateDate 2019年2月10日
	 */
	public static Log getLogger(String className) {
		return LogFactory.getLog(className);
	}

	/**
	 * 获取"HeadlessLog"的Log
	 * 
	 * @return
	 * @author Twenty
	 * @CreateDate 2019年2月10日
	 */
	public static Log getLogger() {
		return getLogger("HeadlessLog");
	}

	/**
	 * 获取Log
	 * 
	 * @param clazz
	 * @return
	 * @author Twenty
	 * @CreateDate 2019年2月10日
	 */
	public static Log getLogger(Class<?> clazz) {
		return getLogger(clazz.getName());
	}

}
