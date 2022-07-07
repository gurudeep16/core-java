class AirportTester{
	public static void main(String a[]){
		
		AirportDTO ap = new AirportDTO();
		ap.setName("Kempegowda International Airport");
		ap.setLocation("Bengaluru");
		ap.setType("International");
		ap.setTaxiLane(true);
		ap.setAvrgFlightLanding(731);
		
		
		System.out.println(ap.getName()+":"+ap.getLocation()+":"+ap.getType()+":"+ap.getTaxiLane()+":"+ap.getAvrgFlightLanding());
		//ap.youHaveTicket();
	}
	
	
}