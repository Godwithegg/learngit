package com.danhuang.service;

import com.danhuang.domain.Account;

/**
 * �˻���ҵ���ӿ�
 * @author danhuang
 *
 */


public interface AccountService
{
	//����id��ѯtest��Ϣ
	Account findAccountById(Integer accountId);
	/**
	 * ת��
	 * @param sourceName	ת��
	 * @param targetName	ת��
	 * @param money	���
	 */
	void transfer(String sourceName,String targetName,Float money);
}
