package cn.study.spring;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// 1. 加载Spring配置文件，获得Spring容器
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// 2. 从Spring容器中获取对象
		Date date = (Date) ac.getBean("date");
		User user = (User) ac.getBean("user");
		Calendar cal = (Calendar) ac.getBean("calendar");
		
		// 3. 测试获取的对象
		System.out.println(date);
		System.out.println(user);
		System.out.println(cal);
		
		// 4. 释放资源
		ac.close();
	}
	
}
