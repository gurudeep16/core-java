class Vegetables{
static String veggies[] = {"Tomato","Potato","onion","Chilli"};
public static void main(String a[]){
String name = getVeggie("Tomato");
System.out.println("veggy to purchase " +name);
}
public static String getVeggie(String veggie ){
String veggyName = null;
for(int i=0;i<veggies.length;i++)
{
   if(veggies[i] == veggie){
     veggyName = veggies[i];
   }
}
 return veggyName;
}


}