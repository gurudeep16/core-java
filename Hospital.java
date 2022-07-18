import java.util.Arrays;
class Hospital 
{
	//Has many Pateints
	PatientDTO[] dtos;
	//instance variable
	int index;
	
	public Hospital(int size)
	{
		System.out.println("Hospital constructor is called");	
        dtos=new PatientDTO[size];		
	}
	
	public boolean createPatient(PatientDTO dto)
	{
		System.out.println("Inside createPatient()");
		boolean isAdded = false;
		if(dto !=null && dto.getName()!=null)
		{
			this.dtos[index++] = dto;
			isAdded=true;
			System.out.println("Pateint details Created successfully");			
		}
		else
		{
			System.out.println("Pateint details sari fill maad");
		}
		
	
	return isAdded;
	}
	
	
	
	public void getPetientDetails()
	{
		for(int i=0; i < dtos.length; i++)
		
		
			System.out.println(dtos[i]);		
	}
	public boolean updatePatientAddressById(int id , String address)
	{
		boolean updatedAddress=false;
		for(int i=0;i<dtos.length;i++)
		{
			if(dtos[i].getID() == id)
			{
				System.out.println("Address Updated successfully");
				dtos[i].setAddress(address);
				updatedAddress=true;				
			}
			else
			{
				System.out.println("ID is not matching please put vallid one");
			}
		}
		return updatedAddress;
	}
	boolean deletePatientByName(String name)
	{ 
		boolean deletePatient=false;
		int i , j;
		for( i=0,j=0;j<dtos.length;j++)
		{
			if(!dtos[j].getName().equals(name))
			{				
				dtos[i++]=dtos[j];
				deletePatient=true;
				System.out.println("Deleted successfully");				
			}
         						
		}
		dtos=Arrays.copyOf(dtos,i);
		return deletePatient;
	}
	boolean deletePatientByAddress(String address)
	{ 
		boolean deletePatient1=false;
		int i , j;
		for( i=0,j=0;j<dtos.length;j++)
		{
			if(!dtos[j].getAddress().equals(address))
			{				
				dtos[i++]=dtos[j];
				deletePatient1=true;
				System.out.println("Deleted successfully");				
			}
         						
		}
		dtos=Arrays.copyOf(dtos,j);
		return deletePatient1;
	}
	
/*	String getPatientByGender(Gender gender)
	{
		//Gender.valueOf(gender);
		String getPatient=null;
		for(int i=0;i<dtos.length;i++){
		if(dtos[i].getGender().equals(gender))
		{
			getPatient=dtos[i].getGender();
			System.out.println("Type of the Order : "+dtos[i].getGender());
		}
		}
		return getPatient;
	}*/
	
	boolean deletePatientByGender(Gender gender)
	{ 
		boolean deletePatientG=false;
		int i , j;
		for( i=0,j=0;j<dtos.length;j++)
		{
			if(!dtos[j].getGender().equals(gender))
			{				
				dtos[i++]=dtos[j];
				deletePatientG=true;
				System.out.println("Deleted successfully");				
			}
         						
		}
		dtos=Arrays.copyOf(dtos,j);
		return deletePatientG;
	}
	
}




