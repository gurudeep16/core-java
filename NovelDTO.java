class NovelDTO{
	public NovelDTO(){
	}
  private String name;
  private String type;
  private double price;
  private String author;
  private int edition;

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
	 
	 public String getAuthor(){
		 return author;
	 }
	 public void setAuthor(String author){
		 this.author=author;
	 }
	 
	 public int getEdition(){
		 return edition;
	 }
	 public void setEdition(int edition){
		 this.edition=edition;
	 }
	 
	 
 /* public void read(){
	  System.out.println("read the novel");
  }*/
	
}