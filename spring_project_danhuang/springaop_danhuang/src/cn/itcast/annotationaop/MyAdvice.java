package cn.itcast.annotationaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect 
public class MyAdvice
{
	@Pointcut("execution(* cn.itcast.service.*ServiceImpl.*(..))")
	public void pc() {}
	
	
	@Before("MyAdvice.pc()")
	public void before()
	{
		System.out.println("����ǰ�ö���");
	}
	@AfterReturning("execution(* cn.itcast.service.*ServiceImpl.*(..))")
	public void afterReturning()
	{
		System.out.println("���Ǻ��ö��� ǰ");
	}
	@Around("execution(* cn.itcast.service.*ServiceImpl.*(..))")
	public Object round(ProceedingJoinPoint pjp) throws Throwable
	{
		Object proceed = pjp.proceed();
		System.out.println("ǰ");
		System.out.println("���ƶ���");
		System.out.println("��");
		return proceed;
	}
	@AfterThrowing("execution(* cn.itcast.service.*ServiceImpl.*(..))")
	public void afterException() 
	{
		System.out.println("������");
	}
	@After("execution(* cn.itcast.service.*ServiceImpl.*(..))")
	public void after()
	{
		System.out.println("����֪ͨ");
	}
}
