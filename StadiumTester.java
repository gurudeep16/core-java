class StadiumTester{
	public static void main(String a[]){
		
		Stadium sd = new Stadium();
		sd.setName("Chinnaswamy");
		sd.setLocation("Bengaluru");
		sd.setEntryFee(2999);
		sd.setMatch("RCB vs CSK");
		sd.setSeatNo(129);
		
		
		System.out.println(sd.getName()+":"+sd.getLocation()+":"+sd.getEntryFee()+":"+sd.getMatch()+":"+sd.getSeatNo());
		sd.watchMatch();
	}
	
	
}