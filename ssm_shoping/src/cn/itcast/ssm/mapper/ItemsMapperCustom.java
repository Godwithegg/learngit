package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQuery;

public interface ItemsMapperCustom
{
	//��Ʒ��ѯ�嵥
	public List<ItemsCustom> findItemsList(ItemsQuery itemsQuery) throws Exception;
}
