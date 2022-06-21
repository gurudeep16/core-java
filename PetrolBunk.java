class PetrolBunk{
   int bunkId;
   static String name = "Indian oil";
   static int noOfBranches = 59;
   String location;
   long contactNo;
   
   public PetrolBunk(int bunkId,String location,long contactNo){
   System.out.println("Petrol bunk object created");
   this.location=location;
   this.bunkId=bunkId;
   this.contactNo=contactNo;
   }
   
   public static void main(String a[]){
	   int gh = 10;
   PetrolBunk bunk = new PetrolBunk(138,"Jayanagar",9484946431L);
   System.out.println("Petrol bunk id :" +bunk.bunkId +", Petrol bunk name :" +name +", No. of branches : " +noOfBranches + ", Bunk location : " +bunk.location +", Contact no : " +bunk.contactNo + gh);
   PetrolBunk bunk1 = new PetrolBunk(139,"Banashankari layout",9484946432L);
   System.out.println("Petrol bunk id :"+bunk1.bunkId +", Petrol bunk name :" +name +", No. of branches : " +noOfBranches + ", Bunk location : "+bunk1.location +", Contact no : " +bunk1.contactNo);
   PetrolBunk bunk2 = new PetrolBunk(140,"BTM layout",9484946433L);
   System.out.println("Petrol bunk id :"+bunk2.bunkId +", Petrol bunk name :" +name +", No. of branches : " +noOfBranches + ", Bunk location : "+bunk2.location +", Contact no : " +bunk2.contactNo);
   PetrolBunk bunk3 = new PetrolBunk(141,"Silk board",9484946434L);
   System.out.println("Petrol bunk id :" +bunk3.bunkId +", Petrol bunk name :" +name +", No. of branches : " +noOfBranches + ", Bunk location : "+bunk3.location +", Contact no : " +bunk3.contactNo);
    
   } 
}