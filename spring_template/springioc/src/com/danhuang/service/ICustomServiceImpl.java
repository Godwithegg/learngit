package com.danhuang.service;

import java.util.Date;

public class ICustomServiceImpl implements ICustomService
{
	private String driver;
	private Integer port;
	private Date today;
	//���������ֶ�û�о����ʵ�����壬ֻ��������ʾע��
	public ICustomServiceImpl(String driver, Integer port, Date today)
	{
		this.driver = driver;
		this.port = port;
		this.today = today;
	}
	@Override
	public void saveCustomer()
	{
		System.out.println("���õ�:"+driver+","+port+","+today);
	}
	


	
}
