package com.danhuang.service;

import com.danhuang.dao.ICustomerDao;

public class ICustomServiceImpl implements ICustomService
{
	private ICustomerDao customerDao = null;
	@Override
	public void saveCustomer()
	{
		System.out.println("ҵ�����ó־ò�");
		customerDao.saveCustomer();
	}
	
}
