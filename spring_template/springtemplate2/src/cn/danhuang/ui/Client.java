package cn.danhuang.ui;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

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
	 * bean�����ּ��ط�ʽ
	 * ctrl+t ������
	 * BeanFactory���ṩ����һ���ӳټ��ص�˼��������Bean����
	 * ApplicationContext���ṩ����һ����������˼��������bean����ֻҪһ�����������ļ���������bean����
	 * @param args
	 */
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
	
//	@SuppressWarnings("all")
//	public static void main(String[] args)
//	{
//		Resource resource = null;
//		resource = new ClassPathResource("bean.xml");
//		//��ȡ����
//		BeanFactory factory = new XmlBeanFactory(resource);
//		//����bean��id��ȡ����
//		ICustomService cs = (ICustomService) factory.getBean("customerService");
//		
//		cs.saveCustomer();
//	}
	
//	/**
//	* bean�����ִ�����ʽ
//	*	1.����Ĭ���޲ι��캯������   (���ַ���ʹ�����
//	*		Ĭ��������������û��Ĭ���޲ι��캯�����򴴽�ʧ�ܻᱨ�쳣
//	*	2.ʹ�ù����еķ�����������
//	*		��Ҫʹ��bean��ǩ��factory-methodָ����̬�����еĴ�������ķ���
//	*	3.ʹ��ʵ�������еķ�������
//	*/
//	@SuppressWarnings("all")
//	public static void main(String[] args)
//	{
//		//��ȡ����
//		BeanFactory factory = new ClassPathXmlApplicationContext("bean.xml");
//		//����bean��id��ȡ����
//		ICustomService cs = (ICustomService) factory.getBean("instanceCustomerService");
//		
//		System.out.println(cs);
//	}
	
//	/**
//	*	bean�����÷�Χ��������ͨ�����õķ�ʽ���������÷�Χ��
//	*		���õ����ԣ�bean��ǩ��scope����
//	*			ȡֵΪ��singleton��������Ĭ�ϣ�
//	*				prototype��������
//	*				request�����÷�Χ��һ������͵�ǰ�����ת����
//	*				session�����÷�Χ��һ�λỰ��
//	*				globalsession�����÷�Χ��һ��ȫ�ֻỰ��
//	*/
//	@SuppressWarnings("all")
//	public static void main(String[] args)
//	{
//		//��ȡ����
//		BeanFactory factory = new ClassPathXmlApplicationContext("bean.xml");
//		//����bean��id��ȡ����
//		ICustomService cs1 = (ICustomService) factory.getBean("customerService");
//		ICustomService cs2 = (ICustomService) factory.getBean("customerService");
//		
//		System.out.println(cs1==cs2);
//	}
	
	/**
	*	bean����������
	*		�漰bean��ǩ���������ԣ�
	*			init-method
	*			destroy-method
	*		������
	*			��������������������ͳ����ˡ�
	*			���ţ�ֻҪ�����ڣ������һֱ���ڡ�
	*			�������������٣�����������
	*		������
	*			������ÿ��ʹ��ʱ����������
	*			���ţ�ֻҪ������ʹ���о�һֱ����
	*			������������ʱ�䲻ʹ�ã�����û�б�Ķ�������ʱ����java�������������ա�
	*/
	@SuppressWarnings("all")
	public static void main(String[] args)
	{
		//��ȡ����
		BeanFactory factory = new ClassPathXmlApplicationContext("bean.xml");
		//����bean��id��ȡ����
		ICustomService cs1 = (ICustomService) factory.getBean("customerService");
		ICustomService cs2 = (ICustomService) factory.getBean("customerService");
		
		System.out.println(cs1==cs2);
	}
}
