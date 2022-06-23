class FaceWash{
String name;
int price;
public static void main(String a[]){
	
   FaceWash f = new FaceWash("Nivea",185);
  System.out.println(f.name+f.price);
}
public FaceWash(){
	this.washYourFace();
    System.out.println("object created");
    
}
   public  FaceWash(String name,int price){
    this();
	this.name = name;
	this.price= price;
   }
      public void washYourFace(){
	    System.out.println("Mukha tolkoli");
	  }
}