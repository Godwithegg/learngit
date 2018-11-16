package cn.itcasta_aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice
{
	public void before()
	{
		System.out.println("����ǰ��֪ͨ");
	}
	public void afterReturning()
	{
		System.out.println("���Ǻ���֪ͨ ǰ��");
	}
	public Object round(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("����֪ͨǰ");
		Object proceed = pjp.proceed();
		System.out.println("����֪ͨ��");
		return proceed;
	}
	public void afterException()
	{
		System.out.println("������");
	}
	public void after()
	{
		System.out.println("���Ǻ���֪ͨ");
	}
}
