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
			double price =sc.nextDouble();
		
		
		FoodDTO dto = new FoodDTO();
			dto.setId(id);
			dto.setType(type);
			dto.setName(name);
			dto.setPrice(price);

          ht.foodMenu(dto);			
		
		
	}
	ht.getMenu();
 }
}