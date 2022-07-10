class Airport1{
	TerminalDTO[] dtos;
	int index;
	
	public Airport1(int size){
		dtos=new TerminalDTO[size];
		System.out.println("constructor creasted");
	}
	
	
	public boolean terminals(TerminalDTO td){
		boolean terminalAd = false;
		if(td!=null){
			this.dtos[index++] = td;
			terminalAd=true;
         System.out.println("added successfully");			
			
		}
		else{
			System.out.println("check it");
		}
		return terminalAd;
	}
	
	public void getTerminalDetails(){
		for(int i=0;i<dtos.length;i++){
			System.out.println(dtos[i].getId()+":"+dtos[i].getType()+":"+dtos[i].getAirportName()+":"+dtos[i].getNoOfEntry()+":"+dtos[i].getNoOfExit());
		}
	}
	
	

}