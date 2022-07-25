package com.xworkz.ecom.crud;

import com.xworkz.ecom.dto.OrderDTO;

public interface Ecom {
	public boolean shopping(OrderDTO odr);
	public void getItem();
	public boolean updateTypeById(int id , String type);
	public boolean deleteOrderByType(String type);
	public boolean deleteOrderByName(String name);
	public String getOrderNameById(int id);
	public String getOrderTypeByName(String name);
	

}
