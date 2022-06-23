class WifiHub{
String name;
int price;
public static void main(String a[]){
	
   WifiHub w = new WifiHub("Airtel",3999);
  System.out.println(w.name+w.price);
}
public WifiHub(){
	this.internetAnywhere();
    System.out.println("object created");
    
}
   public WifiHub(String name,int price){
    this();
	this.name = name;
	this.price= price;
   }
      public void internetAnywhere(){
	    System.out.println("Connect internet at your ease");
	  }
}