import java.util.Arrays;
class Hospital2 {
	
	// has a relation---one to many
    PatientDTO[] dtos ;
	//instace variable
	int index;
	
	public Hospital2(int size)
	{
	  dtos	= new PatientDTO[size];
	System.out.println("Hospital object created");
	}
	
	public boolean createPatient(PatientDTO dto)
	{
		System.out.println("inside create patient");
		boolean isAdded = false;
		if(dto!=null && dto.getId()!=0){
			this.dtos[index++]=dto;
		    isAdded=true;
			System.out.println("patient details added successfully");
		}
		else
		{
			System.out.println("Add it correctly");
		}
		return isAdded;
	}
	
	public void getPatientDetails()
	{
		System.out.println("details of all patient");
		
		for(int i =0 ; i<dtos.length ; i++)
		{
			System.out.println(dtos[i].getId()+": "+dtos[i].getName()+" :"+dtos[i].getAddress()+":"+/*" "+dtos[i].getGender()+" "+*/dtos[i].getContactNo());
		}
	}
	
	public boolean updatePatientAddressById(int id,String address)
	{
		System.out.println("inside updatePatientAddressById");
		   boolean updatedAddress=false;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()==id){
				dtos[i].setAddress(address);
				updatedAddress=true;
				System.out.println("updated successfully");
			}
			else
			{
				System.out.println("not updated");
			}
		}
		return updatedAddress;
	}
	public boolean deletePatientByName(String name)
	{
		boolean patientDeleted=false;
		int i,j;
		for(i=0,j=0;j<dtos.length;j++){
			if(!dtos[j].getName().equals(name)){
				dtos[i++]=dtos[j];
				patientDeleted=true;
			
				System.out.println("deleted");
			}		
		}
		dtos=Arrays.copyOf(dtos,i);
		return patientDeleted;
	}
	
	public String getPatientNameById(int id){
	 String names=null;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()==id){
				names=dtos[i].getName();
				System.out.println(/*dtos[i].getId()+": "+*/dtos[i].getName()/*+" :"+dtos[i].getAddress()+":"+" "+dtos[i].getGender()+" "+dtos[i].getContactNo()*/);
			}
			else{
				System.out.println("not found");
			}
		}
		return names;
	}
	public long getPatientContactNoByName(String name){
		long patientContNo = 0;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getName().equals(name)){
				patientContNo=dtos[i].getContactNo();
				System.out.println(dtos[i].getContactNo());
			}
			else{
				System.out.println("name not matched");
			}
		}
		return patientContNo;
	}
	
	
}