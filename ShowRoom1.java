class ShowRoom1{

   int showRoomId;
   static String name = "Woodland";
   static int noOfBranches = 56;
   String location ;
   long contactNo;
   
    public ShowRoom1(int id, String loc,long cNo){
	System.out.println("Showroom object is created");
	showRoomId=id;
	location=loc;
	contactNo=cNo;

	}
 public static void main(String a[]){
 
   ShowRoom1 show = new ShowRoom1(1,"Jayanagar",9639638523L);
  /* show.showRoomId = 1;
   show.location ="Jayanagar";
   show.contactNo = 9639638523L;*/
   
   System.out.println("Showroom id is : "+show.showRoomId + ", Showroom Name : "+name +", No of branches : "+noOfBranches+", Location : " +show.location+", Contact No : " +show.contactNo);
   
   ShowRoom1 show1 = new ShowRoom1(2,"Rajajinagar",9639638527L);
 /*  show1.showRoomId = 2;
   show1.location ="Rajajinagar";
   show1.contactNo = 9639638527L;*/
   
   System.out.println("Showroom id is :"+show1.showRoomId + ", Showroom Name : "+name +",No of branches : "+noOfBranches+", Location :" +show1.location+", Contact No :" +show1.contactNo);
   
   
 }   
}