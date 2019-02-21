package com.danhuang.jdbctemplate;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.danhuang.dao.TestDao;
import com.danhuang.domain.Test;



/**
 * JdbcTemplate��dao�е��÷�
 * @author danhuang
 *
 */
public class JdbcTemplateDemo3
{
	public static void main(String[] args)
	{
		//1.��ȡ����
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//2.����id��ȡbean����
		TestDao testDao = (TestDao)ac.getBean("testDao");
		//3.ִ�в���
		Test test = testDao.findTestById(14);
		test.setUsername("aaaa");
		testDao.updateTest(test);
	}
}
