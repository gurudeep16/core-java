import java.util.Scanner;
class HospitalTester
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total Patient no : ");
		int size = sc.nextInt();
		
		Hospital hs = new Hospital(size);
		for(int i=0; i<size;i++)
		{
		System.out.print("Enter a Patient ID : ");
		int iD = sc.nextInt();
		
		System.out.print("Enter a Patient Name : ");
		String name= sc.next();
		
		System.out.print("Enter a Patient Gender : ");
		String gender = sc.next();
		
		System.out.print("Enter a Patient Address : ");
		String address = sc.next();
		
		System.out.print("Enter a Patient Contact no : ");
		long contactNo = sc.nextLong();
				
		PatientDTO dto1 = new PatientDTO();
		dto1.setID(iD);
		dto1.setName(name);
		dto1.setGender(Gender.valueOf(gender));
		dto1.setAddress(address);
		dto1.setContactNo(contactNo);
		hs.createPatient(dto1);
				
       }
	   String option=null;
	   do
	   {
		  System.out.println("Enter 1 to fetch all the patient details : ");
		   System.out.println("Enter 2 to update address by Id : ");
		    System.out.println("Enter 3 to delete Patient By Name : ");
			 System.out.println("Enter 4 to delete Patient By Address : ");
			 System.out.println("Enter 5 to delete Patient By Gender : ");
			 
			 int choise = sc.nextInt();
			 
			 switch(choise)
			 {
				 case 1 : hs.getPetientDetails();
				          break;
						  
				 case 2 : System.out.print("Enter the existing Id for update Patient Address : ");
	                      int existingId = sc.nextInt();
	                      System.out.print("Enter the updated Patient Address : ");
	                      String updateAddress=sc.next();
	                      hs.updatePatientAddressById(existingId , updateAddress);
						  break;
						  
	   	         case 3 : System.out.print("Enter the existing name for delete patient: ");
	                      String existingName = sc.next();
	                      hs.deletePatientByName(existingName);
						  break;
	   	  
		         case 4 : System.out.print("Enter the existing Address for delete patient: ");
	                      String existingAdd = sc.next();
	                      hs.deletePatientByAddress(existingAdd);
						  break;
				 case 5 : System.out.print("Enter the Gender for delete patient : ");
	                      String exGender = sc.next();
	                      hs.deletePatientByGender(Gender.valueOf(exGender));
						  break;		  
						  
			    default : System.out.print("Wrong option");
                          break;
										  
			 }
			 System.out.print("Do you continue Y/N : ");		  
                option= sc.next();
	   }
	   while(option.equals("Y"));

    }
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	PatientDTO dto = new PatientDTO();
		dto.setID(iD);
		dto.setName(name);
		//dto.setGender(Gender.male);
		dto.setAddress(address);
		dto.setContactNo(contactNo);
		
		
		
		
		hs.createPatient(dto);
		//
		
	}
}
/*
		PatientDTO dto2 = new PatientDTO();
		dto2.setID(123);
		dto2.setName("Bolu");
		dto2.setGender(Gender.male);
		dto2.setAddress("Bhatkal");
		dto2.setContactNo(8867696331L);
		hs.createPatient(dto2);  
		
		hs.createPatient(dto);
		
		hs.createPatient(dto2);
		*/