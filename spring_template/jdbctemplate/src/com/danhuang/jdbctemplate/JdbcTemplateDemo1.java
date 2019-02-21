package com.danhuang.jdbctemplate;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * JdbcTemplate��������÷�
 * @author danhuang
 *
 */
public class JdbcTemplateDemo1
{
	public static void main(String[] args)
	{
		//��������Դ
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/test");
		ds.setUsername("root");
		ds.setPassword("123456");

		
		//1.��ȡ����
		//JdbcTemplate jt = new JdbcTemplate(ds);
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(ds);
		//2.ִ�в���
		jt.execute("insert into test(username) values('���')");
	}
}
