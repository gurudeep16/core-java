import java.util.Scanner;
class Hospital2Tester{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no of patients to be added : ");
		int size = sc.nextInt();
		Hospital2 ht =  new Hospital2(size);
		
		for(int i=0;i<size;i++){
		
		System.out.print("Enter id : ");
		int id = sc.nextInt();
		System.out.print("Enter name : ");
		String name = sc.next();
		System.out.print("Enter address : ");
		String address = sc.next();
		System.out.print("Enter contact number : ");
		long contactNo = sc.nextLong();
		
			
		PatientDTO dto = new PatientDTO();
		
		dto.setId(id);
		dto.setName(name);
		dto.setAddress(address);
		//dto.setGender(Gender.valueOf(gender));
		dto.setContactNo(contactNo);

		ht.createPatient(dto);
		
		}
		String option=null;
		do{
			System.out.println("Enter 1 to fetch patient details");
			System.out.println("Enter 2 to update patient details");
			System.out.println("Enter 3 to delete patient details by name");
			System.out.println("Enter 4 to get patient contactNo by name");
			System.out.println("Enter 5 to get patient name by id");
			System.out.println("Enter 6 to delete patient name by address");
			
			
			
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			
		switch(choice){
			case 1 : ht.getPatientDetails();
			         break;
					 
			case 2 : System.out.println("enter existing id");
		             int existingId = sc.nextInt();
		             System.out.println("enter new address");
		             String updatedAddress = sc.next();
		             ht.updatePatientAddressById(existingId,updatedAddress);
					 break;
					 
			case 3 : System.out.print("Enter existing name : ");
		            // String existingName = sc.next();
		             //System.out.println("enter name");
		             String names = sc.next();
		             ht.deletePatientByName(names);
					 break;
					 
			case 4 : System.out.println("enter existing name");
		             String name1 = sc.next();
		             ht.getPatientContactNoByName(name1);
					 break;
					 
			case 5 : System.out.println("enter existing id");
		             int id1 = sc.nextInt();
		             ht.getPatientNameById(id1);
					 break;
					 
			case 6 : System.out.print("Enter existing name : ");
			         String names3 = sc.next();
		             ht.deletePatientByName(names3);
					 break;
			
			case 7 : System.out.print("Enter the Gender for delete patient : ");
	                 String exGender = sc.next();
	                 ht.deletePatientByGender(Gender.valueOf(exGender));
				     break;
					 
			default : System.out.println("Enter the proper number");
			         break;
				
		}	
		System.out.println("Do you want to continue Y/N");				
			option = sc.next();
		}
		while(option.equals("Y"));
		
		
      
		
		
		
	    ht.getPatientDetails();
	}

}

