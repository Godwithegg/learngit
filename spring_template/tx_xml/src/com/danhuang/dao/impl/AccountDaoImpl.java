package com.danhuang.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.danhuang.dao.AccountDao;
import com.danhuang.domain.Account;



public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao
{

	@Override
	public Account findAccountById(Integer accountId)
	{
		List<Account> accounts = getJdbcTemplate().query("select * from account where id=?",new BeanPropertyRowMapper<Account>(Account.class),accountId);
		return accounts.isEmpty()?null:accounts.get(0);
	}

	@Override
	public Account findAccountByName(String name)
	{
		List<Account> accounts = getJdbcTemplate().query("select * from account where name=?",new BeanPropertyRowMapper<Account>(Account.class),name);
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
		getJdbcTemplate().update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
	}

	

}
