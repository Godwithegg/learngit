package com.danhuang.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.danhuang.dao.AccountDao;
import com.danhuang.domain.Account;


@Repository("accountDao")
public class AccountDaoImpl implements AccountDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Account findAccountById(Integer accountId)
	{
		List<Account> accounts = jdbcTemplate.query("select * from account where id=?",new BeanPropertyRowMapper<Account>(Account.class),accountId);
		return accounts.isEmpty()?null:accounts.get(0);
	}

	@Override
	public Account findAccountByName(String name)
	{
		List<Account> accounts = jdbcTemplate.query("select * from account where name=?",new BeanPropertyRowMapper<Account>(Account.class),name);
		if(accounts.isEmpty()) 
		{
			return null;//û����������˻�
		}
		if(accounts.size() > 1)
		{
			//�������Ψһ�����������ǵ�Լ��
			throw new RuntimeException("�������Ψһ����������");
		}
		return accounts.get(0);
	}

	@Override
	public void updateAccount(Account account)
	{
		jdbcTemplate.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
	}

	

}
