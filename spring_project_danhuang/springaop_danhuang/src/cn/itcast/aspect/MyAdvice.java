package cn.itcast.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice
{
	public void before()
	{
		System.out.println("����ǰ�ö���");
	}
	public void afterReturning()
	{
		System.out.println("���Ǻ��ö��� ǰ");
	}
	public Object round(ProceedingJoinPoint pjp) throws Throwable
	{
		Object proceed = pjp.proceed();
		System.out.println("ǰ");
		System.out.println("���ƶ���");
		System.out.println("��");
		return proceed;
	}
	public void afterException() 
	{
		System.out.println("������");
	}
	public void after()
	{
		System.out.println("����֪ͨ");
	}
}
