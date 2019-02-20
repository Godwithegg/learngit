package cn.danhuang.ui;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.danhuang.service.ICustomService;

/**
 * 
  * ��Ŀ����:  springtemplate
  * ��:      cn.danhuang.ui    
  * ������:   Client 
  * ������:   spring���ִ�ֵ��ʽ
  * ������:   danhuang 
  * ����ʱ��:  2019��2��18�� ����3:32:24   
  *
 */
public class Client
{
//	/**
//	 * ��������ֵ
//	 * @param args
//	 */
//	@SuppressWarnings("all")
//	public static void main(String[] args)
//	{
//		//��ȡ����
//		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//		//����bean��id��ȡ����
//		ICustomService cs = (ICustomService) ac.getBean("customerService");
//		
//		cs.saveCustomer();
//	}
	
//	/**
//	 * set������ֵ
//	 * @param args
//	 */
//	@SuppressWarnings("all")
//	public static void main(String[] args)
//	{
//		//��ȡ����
//		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//		//����bean��id��ȡ����
//		ICustomService cs = (ICustomService) ac.getBean("customerService2");
//		cs.saveCustomer();
//	}
	
	/**
	 * �������ͷ�����ֵ
	 * @param args
	 */
	@SuppressWarnings("all")
	public static void main(String[] args)
	{
		//��ȡ����
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//����bean��id��ȡ����
		ICustomService cs = (ICustomService) ac.getBean("customerService3");
		cs.saveCustomer();
	}
	
}
