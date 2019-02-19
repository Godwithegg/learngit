package com.danhuang.cglib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

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
		 *			��������Ķ�̬����
		 *				Ҫ�󣺱������಻���������ࡣ���ܱ�final����
		 *				�ṩ�ߣ�������cglib
		 *				�漰���ࣺEnhancer
		 *				�����������ķ�����create��class,Callback)
		 *				�����ĺ��壺
		 *					Class�������������ֽ���
		 *					Callback����δ�������invocationhandler������һ���ġ���Ҳ��һ���ӿڣ�����һ��ʹ�øýӿڵ��ӽӿ�Method'Inter'ceptor
		 *						��ʹ��ʱ������Ҳ�Ǵ����ýӿڵ������ڲ��ࡣ
		 *				
		 */
		Actor cglibActor = (Actor)Enhancer.create(actor.getClass(), new MethodInterceptor()
		{
			/**
			 * ִ�б����������κη������ᾭ���÷��������ͻ��ڽӿڶ�̬�����invoke��������һģһ����
			 *����������
			 *	ǰ��������invoke����������������һ��
			 *		MethodProxy methodProxy����ǰִ�з����Ĵ������һ�㲻�á�
			 */
			@Override
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable
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
		cglibActor.basicAct(20000);
		cglibActor.dangerAct(1000000);
	}
}
