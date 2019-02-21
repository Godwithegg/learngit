package com.danhuang.dao;

import com.danhuang.domain.Test;

/**
 * Test��ĳ־ò�ӿ�
 * @author danhuang
 *
 */
public interface TestDao
{
	/**
	 * ����id��ѯ�˻���Ϣ
	 * @param testId
	 * @return
	 */
	Test findTestById(Integer testId);
	
	/**
	 * �������Ʋ�ѯ�˻���Ϣ
	 * @param name
	 * @return	Ҫ���˻����Ʊ���Ψһ�������ΨһӦ�����쳣
	 */
	Test findTestByName(String name);
	
	/**
	 * �����˻���Ϣ
	 * @param test
	 */
	void updateTest(Test test);
}
