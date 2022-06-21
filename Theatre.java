class Theatre{
 String name;
 String address;
 long contactNo;
 String ownerName;
 String runningMovies[] = new String[3];
  
 
public static void main(String a[]){
	Theatre theater = new Theatre();
theater.name = "Veeresh";
theater.address = "Magadi road";
theater.contactNo = 9859863651L;
theater.ownerName = "Darshan";
theater.runningMovies[0] = "Vikram";
theater.runningMovies[1] = "Charlie 777";
theater.runningMovies[2] = "Major";

System.out.println(theater.name);
System.out.println(theater.address);
System.out.println(theater.contactNo);
System.out.println(theater.ownerName);
System.out.println(theater.runningMovies[0] +"." + theater.runningMovies[1] + ". "+theater.runningMovies[2]  );


Theatre theater1 = new Theatre();
theater1.name = "urvashi";
theater1.address = "sudama nagar";
theater1.contactNo = 9859863651L;
theater1.ownerName = "Sanjay";
theater1.runningMovies[0] = "Vikram";
theater1.runningMovies[1] = "Charlie 777";
theater1.runningMovies[2] = "Pritviraj";


System.out.println(theater1.name);
System.out.println(theater1.address);
System.out.println(theater1.contactNo);
System.out.println(theater1.ownerName);
System.out.println(theater1.runningMovies[0]+". " + theater1.runningMovies[1]+" ." + theater1.runningMovies[2]  );

}



}