class Hotel{
	FoodDTO[] dtos;
	int fi;
	
	public Hotel(int size){
		dtos=new FoodDTO[size];
		System.out.println("Constructor created");
	}
	
	
	public boolean foodMenu(FoodDTO dto){
		
		boolean addFood=false;
      if(dto!=null){
		  this.dtos[fi++]=dto;
	       addFood=true;
		   System.out.println("Food added to menu");
		  
	  }	
     else {
		 System.out.println("Add it correctly");
	 }
     return addFood;	 
		
	}

  public void getMenu(){
	  for (int i=0;i<dtos.length;i++){
		  System.out.println(dtos[i].getId()+":"+dtos[i].getType()+":"+dtos[i].getName()+":"+dtos[i].getPrice());
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
}