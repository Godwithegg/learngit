package com.danhuang.proxy;
/**
 * һ����Ա
 * @author danhuang
 *
 */
public class Actor implements IActor
{
	/**
	 * �������ݳ�
	 * @param money
	 */
	public void basicAct(float money)
	{
		System.out.println("�õ�Ǯ����ʼ�������ݣ�"+money);
	}
	/**
	 * Σ�յı���
	 * @param money
	 */
	public void dangerAct(float money)
	{
		System.out.println("�õ�Ǯ����ʼΣ�ձ���"+money);
	}
}
