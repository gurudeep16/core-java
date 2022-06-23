class WaterBottle{
String name;
int price;
public static void main(String a[]){
	
   WaterBottle w = new WaterBottle("Cello",255);
  System.out.println(w.name+w.price);
}
public WaterBottle(){
	this.drinkWater();
    System.out.println("object created");
    
}
   public  WaterBottle(String name,int price){
    this();
	this.name = name;
	this.price= price;
   }
      public void drinkWater(){
	    System.out.println("Daily min 2ltr water kudiri");
	  }
}