package com.danhuang.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.danhuang.dao.TestDao;
import com.danhuang.domain.Test;

/**
 * Test���ҵ���ʵ����
 * @author danhuang
 *
 */
public class TestDaoImpl implements TestDao
{
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt)
	{
		this.jt = jt;
	}

	@Override
	public Test findTestById(Integer testId)
	{
		List<Test> tests = jt.query("select * from test where id=?",new BeanPropertyRowMapper<Test>(Test.class),testId);
		return tests.isEmpty()?null:tests.get(0);
	}

	@Override
	public Test findTestByName(String username)
	{
		List<Test> tests = jt.query("select * from test where username=?",new BeanPropertyRowMapper<Test>(Test.class),username);
		if(tests.isEmpty()) 
		{
			return null;//û����������˻�
		}
		if(tests.size() > 1)
		{
			//�������Ψһ�����������ǵ�Լ��
			throw new RuntimeException("�������Ψһ����������");
		}
		return tests.get(0);
	}

	@Override
	public void updateTest(Test test)
	{
		jt.update("update test set username=?",test.getUsername());;
	}
	
}
