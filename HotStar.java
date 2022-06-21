class Hotstar
{
public static void main(String a[])
{
String series[] = {"Special Ops","Eclipse","Aarya","The Empire","The Legend Hunuman","Live Telecast","1232KMS","Hundred","The Empire","Panipat","Alliance"};

String hindiMovies[] = {"Masaan","pink","Dishoom","Talvar","Neerja","Baby","Drishyam","Raid","Maqbool","Bang Bang"};

String englishMovies[] = {"Lion King","Mulan","Moana","Raya","whitecollor","The Quest","Thor","Hung","Barry","24" };
{
System.out.println("Hotstar");
System.out.println("----------------------------");
System.out.println("List of Series");
System.out.println("----------------------------");
for (int i=0;i<series.length;i++ ){
System.out.println(series[i]);
System.out.println("----------------------------");
}

System.out.println("List of Hindi Movies");
System.out.println("----------------------------");
for (int i=0;i<hindiMovies.length;i++ )
System.out.println(hindiMovies[i]);
System.out.println("----------------------------");

System.out.println("List of English Movies");
System.out.println("----------------------------");
for (int i=0;i<englishMovies.length;i++ )
System.out.println(englishMovies[i]);
System.out.println("----------------------------");
}
}
}