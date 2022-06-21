class Shoe{
String brand;
int size;
String type;
int price;
String colour;

public static void main(String a[]){
    Shoe shoe=new Shoe();
	shoe.brand = "Adidas";
	shoe.size = 8;
	shoe.type = "Casual";
	shoe.price = 7899;
	shoe.colour = "Navy blue";
	
System.out.println("Brand name is " + shoe.brand + "Shoe size is "+ shoe.size +"Shoe type is "+ shoe.type + "Shoe price "+shoe.price + "Shoe colour " +shoe.colour);

Shoe shoe1=new Shoe();
	shoe1.brand = "Puma";
	shoe1.size = 7;
	shoe1.type = "Sport";
	shoe1.price = 9899;
	shoe1.colour = "Black";
	
System.out.println("Brand name is " +shoe1.brand +  " Shoe size is "+shoe1.size + " Shoe type is "+shoe1.type + " Shoe price "+shoe1.price +  " Shoe colour " +shoe1.colour);

Shoe shoe2=new Shoe();
	shoe2.brand = "Nike";
	shoe2.size = 7;
	shoe2.type = "Casual";
	shoe2.price = 6999;
	shoe2.colour = "Blue";
	
System.out.println("Brand name is " +shoe2.brand 
+"Shoe size is "+shoe2.size
 +"Shoe type is "+shoe2.type 
 +"Shoe price "+shoe2.price 
 +"Shoe colour " +shoe2.colour);

Shoe shoe3=new Shoe();
	shoe3.brand = "Bata";
	shoe3.size = 9;
	shoe3.type = "Formal";
	shoe3.price = 5999;
	shoe3.colour = "Deep black";
	
System.out.println("Brand name is " +shoe3.brand +" Shoe size is "+shoe3.size +" Shoe type is "+shoe3.type +" Shoe price "+shoe3.price +" Shoe colour " +shoe3.colour);
}


}