class NewspaperDTO{
	public NewspaperDTO(){
	}
  private String name;
  private String type;
  private double price;
  private String publications;
  private String language;

     public String getName(){
	  return name;
     }
     public void setName(String name){ 
	   this.name=name;
	 }
	 
	 public String getType(){
		 return type;
	 }
	 public void setType(String type){
		 this.type=type;
	 }
	 
	 public double getPrice(){
		 return price;
	 }
	 public void setPrice(double price){
		 this.price=price;
	 }
	 
	 public String getPublications(){
		 return publications;
	 }
	 public void setPublications(String publications){
		 this.publications=publications;
	 }
	 
	 public String getLanguage(){
		 return language;
	 }
	 public void setLanguage(String language){
		 this.language=language;
	 }
	 
	 
 /* public void read(){
	  System.out.println("read it daily");
  }*/
	
}