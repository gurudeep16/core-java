class Film
{
	static String movies[] = {"Charlie 777","Major","Vikram","Pritviraj"};
	public static void main(String a[])
	{
	String movie = getMovie("Charlie 777");
	System.out.println("movie Name" +movie)'
	}
	public static void getMovie(String movie)
	{
		for(int i=0;i<movies.length;i++)
		{
		 	movies[i]=movie;
		}
	}
}