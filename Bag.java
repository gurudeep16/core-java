class Bag{
String name;
int price;
public static void main(String a[]){
	
   Bag b = new Bag("Wildcraft",899);
  System.out.println(b.name+b.price);
}
public Bag(){
	this.bagOlleIde();
    System.out.println("object created");
    
}
   public Bag(String name,int price){
    this();
	this.name = name;
	this.price= price;
   }
      public void bagOlleIde(){
	    System.out.println("Trip ge hakond hogbodu");
	  }
}