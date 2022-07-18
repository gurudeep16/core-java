import java.util.Arrays;
class E_commerce
{
	OrderDTO[] dtos;
	int index;
	public E_commerce(int size)
	{
		dtos=new OrderDTO[size];
	}
	public boolean shopping(OrderDTO odr)
	{
		boolean cart= false;
		if (odr !=null)
		{
			dtos[index++]=odr;
			cart= true;
			System.out.println("Items got selected : ");
		}
		return cart;
	}
	public void getItem()
	{
		for(int i=0;i<dtos.length;i++)
		{
			System.out.println("Cart details : ");
			System.out.println(dtos[i]);
		}
	}
	boolean updateTypeById(int id , String type)
	{
		boolean updateType=false;
		for(int i=0;i<dtos.length;i++)
		{
			if(dtos[i].getId() == id)
			{
				dtos[i].setType(type);
				updateType=true;
				System.out.println("Type updated successfully");
			}
		}
		return updateType;
	}
	boolean deleteOrderByType(String type)
	{ 
		boolean deleteOrder=false;
		int i , j;
		for( i=0,j=0;j<dtos.length;j++)
		{
			if(!dtos[j].getType().equals(type))
			{				
				dtos[i++]=dtos[j];
				deleteOrder=true;
				System.out.println("Deleted successfully");				
			}
         						
		}
		dtos=Arrays.copyOf(dtos,i);
		return deleteOrder;
	}
	boolean deleteOrderByName(String name)
	{ 
		boolean deleteOrder=false;
		int i , j;
		for( i=0,j=0;j<dtos.length;j++)
		{
			if(!dtos[j].getName().equals(name))
			{				
				dtos[i++]=dtos[j];
				deleteOrder=true;
				System.out.println("Deleted successfully");				
			}
         						
		}
		dtos=Arrays.copyOf(dtos,i);
		return deleteOrder;
	}
	
	String getOrderNameById(int id)
	{
		String name=null;
		for(int i=0;i<dtos.length;i++)
		if(dtos[i].getId() == id)
		{
			name=dtos[i].getName();
			System.out.println("Name of the Order : "+dtos[i].getName());
		}
		return name;
	}
	
	String getOrderTypeByName(String name)
	{
		String type=null;
		for(int i=0;i<dtos.length;i++){
		if(dtos[i].getName().equals(name))
		{
			type=dtos[i].getType();
			System.out.println("Type of the Order : "+dtos[i].getType());
		}
		}
		return type;
	}
	
	
}