package com.danhuang.factory;

import com.danhuang.service.ICustomService;
import com.danhuang.service.ICustomServiceImpl;

/**
 * 
  * ��Ŀ����:  springtemplate2
  * ��:      com.danhuang.factory    
  * ������:   ģ��һ��ʵ������
  * ������:   һ�仰��������Ĺ���
  * ������:   danhuang   
  * ����ʱ��:  2019��2��18�� ����6:26:16   
  *
 */
public class InstanceFactory implements ICustomService
{
	public ICustomService getCustomerService()
	{
		return new ICustomServiceImpl();
	}

	@Override
	public void saveCustomer()
	{
		// TODO Auto-generated method stub
		
	}
}
