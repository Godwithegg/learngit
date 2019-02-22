package com.danhuang.dao;

import com.danhuang.domain.Account;

public interface AccountDao
{
	/**
	 * ����id��ѯ�˻���Ϣ
	 * @param accountId
	 * @return
	 */
	Account findAccountById(Integer accountId);
	
	/**
	 * �������Ʋ�ѯ�˻���Ϣ
	 * @param name
	 * @return	Ҫ���˻����Ʊ���Ψһ�������ΨһӦ�����쳣
	 */
	Account findAccountByName(String name);
	
	/**
	 * �����˻���Ϣ
	 * @param account
	 */
	void updateAccount(Account account);
}
