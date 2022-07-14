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
			System.out.println(dtos[i].getId()+ " : "+dtos[i].getType()+ ":  "+dtos[i].getName()+ ": "+dtos[i].getPrice());
		}
	}
	 public boolean updateNameById(int id,String name){
		System.out.println("inside updateName");
		   boolean updatedName=false;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()==id){
				dtos[i].setName(name);
				updatedName=true;
				System.out.println("updated successfully");
			}
			else{
				System.out.println("not updated");
			}
		}
		return updatedName;
}