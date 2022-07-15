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
		//ht.getPatientDetails();
        /* System.out.println("enter existing id");
		 int existingId = sc.nextInt();
		 System.out.println("enter new address");
		 String updatedAddress = sc.next();
		ht.updatePatientAddressById(existingId,updatedAddress);
		//ht.getPatientDetails();*/
		
		//System.out.print("Enter existing name : ");
		// String existingName = sc.next();*/
		System.out.println("enter name");
		 String names = sc.next();
		ht.deletePatientByName(names);
		
		ht.getPatientDetails();
	}

}