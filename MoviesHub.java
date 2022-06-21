class MoviesHub{
static String movies[] = {"Charlie 777","Vikram","Major","Pritviraj","BB 2"};
    public static void main(String a[]){
		 String value = getMovie("Major");
	  System.out.println("come we will watch "+value);
	  }
	  public static String getMovie(String movie){
	  String movieName = null;
		 
	for(int i=0;i<movies.length;i++){
		if(movies[i] == movie){
			 movieName= movies[i];
		}
		else{
			System.out.println("movie not available " +movie);
		}
	}
	return movieName;
	}

} 