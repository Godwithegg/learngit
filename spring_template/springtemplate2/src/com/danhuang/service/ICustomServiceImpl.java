package com.danhuang.service;


public class ICustomServiceImpl implements ICustomService
{
	public ICustomServiceImpl()
	{
		System.out.println("bean���󱻴���");
	}
	public void init()
	{
		System.out.println("�����ʼ��");
	}
	public void destroy()
	{
		System.out.println("����������");
	}
	@Override
	public void saveCustomer()
	{
		System.out.println("����һ��");
	}
	
}
