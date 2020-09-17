package com.zhiwen.conf;

import com.zhiwen.beans.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangzhiwen
 * @version 1.0
 * @description 主配置类
 * @date 2020/9/16 21:41
 **/
@Configuration
@ComponentScan("com.zhiwen")
public class MainConfig {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		bean.sayHi();
	}
}
