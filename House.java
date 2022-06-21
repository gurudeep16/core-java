class House
{
String type;
String housigUnit;
int rentAmount;
String location;
public static void main(String a[])
{
House house =new House();
house.type="Duplex";
house.housigUnit="3BHK";
house.rentAmount=30000;
house.location="Vijaynagar";


System.out.println("House type " +house.type + " BHK  " +house.housigUnit + " Location of the House " +house.location + " Rent Amount " +house.rentAmount);
System.out.println("---------------------------------------------------");

House house1 =new House();
house1.type="Duplex";
house1.housigUnit="4BHK";
house1.rentAmount=35000;
house1.location="jaynagar";


System.out.println("House type " +house1.type + " BHK  " +house1.housigUnit + " Location of the House " +house1.location + " Rent Amount " +house1.rentAmount);
System.out.println("---------------------------------------------------");

House house2 =new House();
house2.type="Simplex";
house2.housigUnit="3BHK";
house2.rentAmount=18000;
house2.location="Rtnagar";


System.out.println("House type " +house2.type + " BHK  " +house2.housigUnit + " Location of the House " +house2.location + " Rent Amount " +house2.rentAmount);
System.out.println("---------------------------------------------------");
}

}