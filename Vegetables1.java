class Vegetables1{
String name;
int price;
public static void main(String a[]){
	
   Vegetables1 v = new Vegetables1("Cucumber",45);
  System.out.println(v.name+v.price);
}
public Vegetables1(){
	this.goodForHeatlt();
    System.out.println("object created");
    
}
   public  Vegetables1(String name,int price){
    this();
	this.name = name;
	this.price= price;
   }
      public void goodForHeatlt(){
	    System.out.println("Eat veggie stay healthy");
	  }
}