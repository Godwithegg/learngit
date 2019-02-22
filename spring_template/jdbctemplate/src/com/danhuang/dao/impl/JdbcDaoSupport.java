package com.danhuang.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.danhuang.dao.TestDao;
import com.danhuang.domain.Test;

//jdbcDaoSupport���TestDaoImpl2��˼����ʽ
public class JdbcDaoSupport
{
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate()
	{
		return jdbcTemplate;
	}
	public void setDataSource(DataSource dataSource)
	{
		//�ж�jdbcTemplate�Ƿ�Ϊnull
		if(jdbcTemplate == null)
		{
			createJdbcTemplate(dataSource);
		}
	}

	private void createJdbcTemplate(DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
		
	}
	
	
}
