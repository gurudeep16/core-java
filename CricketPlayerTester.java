class CricketPlayerTester
{
public static void main(String a[])
{
CricketPlayer pl = new CricketPlayer();
pl.batting="Right hand batsman";
pl.role="Finisher";
pl.from="Ranchi";
pl.age=40;
pl.player();
System.out.println(pl.batting+ ":" +pl.role+ ":" +pl.from+ ":"+ pl.age);

}


}