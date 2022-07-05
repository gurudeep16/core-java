class Airport{
	public Airport(){
	}
  private String name;
  private String location;
  private String type;
  private boolean taxiLane ;
  private int avrgFlightLanding;

     public String getName(){
	  return name;
     }
     public void setName(String name){ 
	   this.name=name;
	 }
	 
	 public String getLocation(){
		 return location;
	 }
	 public void setLocation(String location){
		 this.location=location;
	 }
	 
	 public String getType(){
		 return type;
	 }
	 public void setType(String type){
		 this.type=type;
	 }
	 
	 public boolean getTaxiLane(){
		 return taxiLane;
	 }
	 public void setTaxiLane(boolean taxiLane){
		 this.taxiLane=taxiLane;
	 }
	 
	 public int getAvrgFlightLanding(){
		 return avrgFlightLanding;
	 }
	 public void setAvrgFlightLanding(int avrgFlightLanding){
		 this.avrgFlightLanding=avrgFlightLanding;
	 }
	 
	 
  public void youHaveTicket(){
	  System.out.println("Travel in plane");
  }
	
}