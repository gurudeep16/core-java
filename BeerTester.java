class BeerTester
{
public static void main(String a[])
{
Beer beer =new Beer();
beer.price=145;
beer.alcohalcontent="8%";
beer.mfgDate="25May2022";
beer.expiry= "best before 24m";
beer.toGetTrip();
System.out.println(beer.price + ":" +beer.alcohalcontent + ":" +beer.mfgDate + ":"+beer.expiry);

}

}