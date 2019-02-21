package com.danhuang.jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.danhuang.domain.Test;



/**
 * JdbcTemplate������
 * @author danhuang
 *
 */
public class JdbcTemplateDemo2
{
	public static void main(String[] args)
	{
		//1.��ȡ����
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//2.����id��ȡbean����
		JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
		//3.ִ�в���
		//����
		//jt.update("insert into test(username) values(?)", "a");
		//����
		//jt.update("update test set username=? where id=?","c",4);
		//ɾ��
		//jt.update("delete from test where id=?",4);
		//��ѯ����
//		List<Test> tests = jt.query("select * from test where id > ?",new BeanPropertyRowMapper<Test>(Test.class) ,10);
//		System.out.println(tests);
		//��ѯһ��
//		List<Test> test = jt.query("select * from test where id = ?",new BeanPropertyRowMapper<Test>(Test.class) ,100);
//		System.out.println(test.isEmpty()?"û�н��":test);
		List<Test> test = jt.query("select * from test where id = ?",new TestRowMapper() ,100);
		System.out.println(test.isEmpty()?"û�н��":test);
		//��ѯ����һ��һ�У��ۺϺ�����ʹ��
		//queryForObject��spring 3.x֮����·�������3.x֮ǰ�����ķ����Ƕ����queryForInt queryForLong...,������������ǿת
		Integer count1 = jt.queryForObject("select count(*) from test where id > ?", Integer.class,10);
		Long count2 = jt.queryForObject("select count(*) from test where id > ?", Long.class,10);
		System.out.println(count1+count2);
	}
}
class TestRowMapper implements RowMapper<Test>
{

	@Override
	public Test mapRow(ResultSet rs, int index) throws SQLException
	{
		Test test = new Test();
		test.setId(rs.getInt("id"));
		test.setUsername(rs.getString("username"));
		test.setUser_id(rs.getInt("user_id"));
		return test;
	}
	
}
