class Restaurants
{
String restaurantName;
String location;
long contactNo;
String ownerName;
String[] food={"Butter chiken","Biryani","Roti","Fride rice","Tandoori"};
String[] food1={"Butter chiken","Biryani","Roti","Fride rice","Tandoori"};
public static void main(String a[])
{
Restaurants restaurant =new Restaurants();
restaurant.restaurantName="Ocean Inn";
restaurant.location="Rajajinagar";
restaurant.contactNo=9824754225L;
restaurant.ownerName="Gurudeep";

System.out.println("restaurant name is " +restaurant.restaurantName);
System.out.println("restaurant located in " +restaurant.location);
System.out.println("restaurant contactNo is " +restaurant.contactNo);
System.out.println("restaurant owner name is " +restaurant.ownerName);
restaurant.getFood();

System.out.println("---------------------------------------------------");

Restaurants restaurant1 =new Restaurants();
restaurant1.restaurantName="Royal kitchen";
restaurant1.location="Jayanagar";
restaurant1.contactNo=8567923145L;
restaurant1.ownerName="Akash";


System.out.println("restaurant name is " +restaurant1.restaurantName);
System.out.println("restaurant located in " +restaurant1.location);
System.out.println("restaurant contactNo is " +restaurant1.contactNo);
System.out.println("restaurant owner name is " +restaurant1.ownerName);

restaurant1.getFood1();

}
public void getFood()
{
for(int i=0;i<food.length;i++)
{
System.out.println(food[i]);
}
}
public void getFood1()
{
for(int i=0;i<food1.length;i++)
{
System.out.println(food1[i]);
}
}
}