class Biscuits{
static String biscuits[] = {"Tiger","Parle","Oreo","JimJam"};
public static void main(String a[])
{
String biscuit = getBiscuit("Oreo");
System.out.println("i want " +biscuit);

}
public static String getBiscuit(String biscuit)
{
for(int i=0;i<biscuits.length;i++){
    biscuits[i]=biscuit;
  
}
return biscuit;
}


}