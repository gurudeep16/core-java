import java.util.Scanner;
class HotelTester{
	
	public static void main(String a[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("No of items to be added");
		int size = sc.nextInt();
		
		Hotel ht = new Hotel(size);
		for(int i=0;i<size;i++){
			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("Enter type");
			String type = sc.next();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("enter price");
			int price =sc.nextInt();
		
		
		FoodDTO dto = new FoodDTO();
			dto.setId(id);
			dto.setType(type);
			dto.setName(name);
			dto.setPrice(price);

          ht.foodMenu(dto);			
		
		
	}
	
	String option=null;
		do{
			System.out.println("Enter 1 to fetch menu details");
			System.out.println("Enter 2 to update food name");
			System.out.println("Enter 3 to update price by name");
			System.out.println("Enter 4 to delete by name");
			System.out.println("Enter 5 to delete by type");
			System.out.println("Enter 6 to get name by id");
			
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			
		switch(choice){
			case 1 : ht.getMenu();
			         break;
					 
			case 2 : System.out.println("enter existing id");
		             int existingId = sc.nextInt();
		             System.out.println("enter new name");
		             String updatedName = sc.next();
		             ht.updateNamesById(existingId,updatedName);
					 break;
					 
			case 3 : System.out.print("Enter existing name : ");
		             String existingName = sc.next();
		             System.out.println("enter new price");
		             int newPrice = sc.nextInt();
		             ht.updatePriceByName(existingName,newPrice);
					 break;
			case 4 : System.out.println("enter existing name");
		             String name1 = sc.next();
		             ht.deleteByName(name1);
					 break;
					 
			case 5 : System.out.println("enter existing name");
		             String name2 = sc.next();
		             ht.deleteByType(name2);
					 break;
			
			case 6 : System.out.println("enter existing name");
		             int id1 = sc.nextInt();
		             ht.getFoodNameById(id1);
					 break;
					 
			default : System.out.println("Enter the proper number");
			         break;
				
		}	
		System.out.println("Do you want to continue Y/N");				
			option = sc.next();
		}
		while(option.equals("Y"));
	
		ht.getMenu();
 }
}