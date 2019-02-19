package com.danhuang.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ģ��һ������
 * @author danhuang
 *
 */
public class Client
{
	public static void main(String[] args)
	{
		final Actor actor = new Actor();
//		actor.basicAct(100f);
//		actor.dangerAct(500f);
		/**
		 * ��̬����:
		 * 		���ã����ı�Դ��Ļ����ϣ������еķ���������ǿ����AOP˼���ʵ�ּ�����
		 * 		���ࣺ
		 * 			���ڽӿڵĶ�̬����������������ʵ��һ���ӿڣ�
		 * 				�ṩ�ߣ�JDK�ٷ�
		 * 				�漰���ࣺProxy
		 * 				��������ķ�����newProxyInstance(ClassLoader, Class[], InvocationHandler)
		 * 					�����ĺ��壺
		 * 						ClassLoader������������ͱ��������ʹ��ͬ�������������һ�㶼�ǹ̶�д����
		 * 						Class[]:�ֽ������顣��������ʵ�ֵĽӿڣ�Ҫ��������ͱ�������������ͬ����Ϊ��һ�㶼�ǹ̶�д��
		 * 						InvocationHandler:����һ���ӿڣ��������������ṩ����ġ�����һ�㶼��дһ���ýӿڵ�ʵ���࣬�����������ڲ��࣬Ҳ���Բ���
		 * 										���ĺ�����ǣ���δ����˴�����ֻ����˭��˭�ṩ��
		 * 										����ģʽ��
		 * 											ʹ��Ҫ�������Ѿ����ˣ�Ŀ����ȷ����ɹ��̾��ǲ���
		 * 										��dbutils�е�ResultSetHandler���ǲ���ģʽ�ľ���Ӧ�á�
		 */
		IActor proxyActor = (IActor)Proxy.newProxyInstance(Actor.class.getClassLoader(), Actor.class.getInterfaces(), new InvocationHandler()
		{
			/**
			 * ִ�б����������κη������ᾭ���÷������÷��������صĹ���
			 * �����Ĳ�����
			 * 	Object proxy�������������ã���һ��ÿ�ζ�����
			 * 	Method method����ǰִ�еķ���
			 * 	Object[] args����ǰִ�з�����Ҫ�Ĳ���
			 * ����ֵ��
			 * 	��ǰ�����ķ���ֵ
			 */
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
			{
				Object rtValue = null;
				//1.ȡ��ִ�з����еĲ���
				Float money = (Float)args[0];
				//2.�жϵ�ǰִ�е���ʲô����
				if("basicAct".equals(method.getName()))
				{
					//�����ݳ�
					if(money > 10000)
					{
						//ִ�з���
						rtValue = method.invoke(actor, money);
					}
				}
				if("dangerAct".equals(method.getName()))
				{
					//Σ���ݳ�
					if(money > 50000)
					{
						//ִ�з���
						rtValue = method.invoke(actor,money);
					}
				}
				return rtValue;
			}
		});
		proxyActor.basicAct(20000);
		proxyActor.dangerAct(50000);
	}
}
