package com.danhuang.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.danhuang.dao.TestDao;
import com.danhuang.domain.Test;

/**
 * Test���ҵ���ʵ����
 * @author danhuang
 *
 */
public class JdbcDaoSupport
{
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	
	
}
