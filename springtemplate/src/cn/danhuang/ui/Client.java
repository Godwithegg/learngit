package cn.danhuang.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.danhuang.dao.ICustomerDao;
import com.danhuang.service.ICustomService;

/**
 * 
  * ��Ŀ����:  springtemplate
  * ��:      cn.danhuang.ui    
  * ������:   Client 
  * ������:   spring���Ű���
  * ������:   danhuang 
  * ����ʱ��:  2019��2��18�� ����3:32:24   
  *
 */
public class Client
{
	/**
	 * ctrl+t ������
	 * ClassPathXmlApoplicationContext:ֻ�ܼ�����·���������ļ�
	 * FileSystemXmlApplicationContext�����ش�������λ�õ������ļ�
	 * @param args
	 */
	public static void main(String[] args)
	{
		//��ȡ����
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//����bean��id��ȡ����
		ICustomService cs = (ICustomService) ac.getBean("customerService");
		
		ICustomerDao cdao = (ICustomerDao)ac.getBean("customerDao");
		
		System.out.println(cs);
		System.out.println(cdao);
		
	}
}
