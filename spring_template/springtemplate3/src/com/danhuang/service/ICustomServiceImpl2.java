package com.danhuang.service;

import java.util.Date;

public class ICustomServiceImpl2 implements ICustomService
{
	private String driver;
	private Integer port;
	private Date today;
	//���������ֶ�û�о����ʵ�����壬ֻ��������ʾע��

	public void setDriver(String driver)
	{
		this.driver = driver;
	}
	public void setPort(Integer port)
	{
		this.port = port;
	}
	public void setToday(Date today)
	{
		this.today = today;
	}
	@Override
	public void saveCustomer()
	{
		System.out.println("���õ�:"+driver+","+port+","+today);
	}


	
}
