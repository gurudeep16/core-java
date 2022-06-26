class CountryTester
{
public static void main(String a[])
{
Country c = new Country();
c.capital="New Delhi";
c.population="138cr";
c.originContinent="Asia";
c.states=28;
c.myCountry();
System.out.println(c.capital+ ":" +c.population+ ":" +c.originContinent+ ":"+ c.states);

}


}