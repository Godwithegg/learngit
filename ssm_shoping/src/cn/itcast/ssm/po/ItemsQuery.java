package cn.itcast.ssm.po;

import java.util.List;

/**
 * 
* ��Ŀ���ƣ�ssm_shoping 
* �����ƣ�ItemsQuery 
* ����������Ʒ�İ�װ���� 
* �����ˣ��ֲӻ�
* ����ʱ�䣺2019��1��27�� ����3:49:54 
* @version
 */
public class ItemsQuery
{
	//��Ʒ��Ϣ
	private Items items;
	//����չ����Ʒ��Ϣ��
	private ItemsCustom itemsCustom;
	//��Ʒ�嵥
	private List<ItemsCustom> itemsList;
	public Items getItems()
	{
		return items;
	}
	public void setItems(Items items)
	{
		this.items = items;
	}
	public ItemsCustom getItemsCustom()
	{
		return itemsCustom;
	}
	public void setItemsCustom(ItemsCustom itemsCustom)
	{
		this.itemsCustom = itemsCustom;
	}
	public List<ItemsCustom> getItemsList()
	{
		return itemsList;
	}
	public void setItemsList(List<ItemsCustom> itemsList)
	{
		this.itemsList = itemsList;
	}
}
