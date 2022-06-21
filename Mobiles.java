class Mobiles{
String brand;
long modelNo;
int price;
String colour;
String batteryCap;

public static void main(String a[]){
    Mobiles mobile = new Mobiles();
	mobile.brand = "Apple";
	mobile.modelNo = 659815L;
	mobile.price = 89990;
	mobile.colour = "Black";
	mobile.batteryCap = "3990 mAh";
	
System.out.println("Mobile brand is :" +mobile.brand +" mobile model no : " +mobile.modelNo +" Mobile price :" +mobile.price +"Mobile colour : " +mobile.colour +" Battery capacity :" +mobile.batteryCap);

Mobiles mobile1 = new Mobiles();
	mobile1.brand = "Samsung";
	mobile1.modelNo = 96856L;
	mobile1.price = 35999;
	mobile1.colour = "Crystal green";
	mobile1.batteryCap = "4500 mAh";
	
System.out.println("Mobile brand is :" +mobile1.brand +" mobile model no : " +mobile1.modelNo +" Mobile price :" +mobile1.price +"Mobile colour : " +mobile1.colour +" Battery capacity :" +mobile1.batteryCap);

Mobiles mobile2 = new Mobiles();
	mobile2.brand = "Realme";
	mobile2.modelNo = 3269L;
	mobile2.price = 15999;
	mobile2.colour = "Grey";
	mobile2.batteryCap = "5000 mAh";
	
System.out.println("Mobile brand is :" +mobile2.brand +" mobile model no : " +mobile2.modelNo +" Mobile price :" +mobile2.price +"Mobile colour : " +mobile2.colour +" Battery capacity :" +mobile2.batteryCap);
}

}