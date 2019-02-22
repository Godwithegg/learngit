package com.danhuang.service.impl;

import com.danhuang.dao.AccountDao;
import com.danhuang.domain.Account;
import com.danhuang.service.AccountService;

/**
 * �˻���ҵ���ӿ�
 * @author danhuang
 *
 */


public class AccountServiceImpl implements AccountService
{
	private AccountDao accountDao;

	public AccountDao getAccountDao()
	{
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao)
	{
		this.accountDao = accountDao;
	}

	@Override
	public Account findAccountById(Integer accountId)
	{
		return accountDao.findAccountById(accountId);
	}

	@Override
	public void transfer(String sourceName, String targetName, Float money)
	{
		//1.�������Ʋ�ѯ�˻���Ϣ
		Account source = accountDao.findAccountByName(sourceName);
		Account target = accountDao.findAccountByName(targetName);
		//2.ת���˻���Ǯ��ת���Ǯ
		source.setMoney(source.getMoney() - money);
		target.setMoney(target.getMoney() + money);
		//3.�����˻���Ϣ
		accountDao.updateAccount(source);
		accountDao.updateAccount(target);
		
	}
	
}
