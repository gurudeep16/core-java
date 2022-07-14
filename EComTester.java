import java.util.Scanner;
class EComTester
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the No of item : ");
		int size =sc.nextInt();
		E_commerce ec = new E_commerce(size);
		for(int i=0; i<size;i++)
		{
			System.out.println("Entre the ID of item : ");
			int id = sc.nextInt();
			System.out.println("Entre a Type of the item : ");
			String type = sc.next();
			System.out.println("Entre a Name of the item : ");
			String name = sc.next();
			System.out.println("Entre the cost of item : ");
			int price = sc.nextInt();
			
			OrderDTO odr = new OrderDTO();
			odr.setId(id);
			odr.setType(type);
			odr.setName(name);
			odr.setPrice(price);
			
			ec.shopping(odr);
		
		}
			ec.getItem();
		 System.out.println("enter existing id");
		 int existingId = sc.nextInt();
		 System.out.println("enter new name");
		 String updatedName = sc.next();
		ht.updateNamesById(existingId,updatedName);
		ht.getPatientDetails();
	}
}