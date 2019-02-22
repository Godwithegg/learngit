package com.danhuang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danhuang.dao.AccountDao;
import com.danhuang.domain.Account;
import com.danhuang.service.AccountService;

/**
 * �˻���ҵ���ӿ�
 * @author danhuang
 *
 */

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService
{
	@Autowired
	private AccountDao accountDao;

	public AccountDao getAccountDao()
	{
		return accountDao;
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
