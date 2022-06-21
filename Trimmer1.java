class Trimmer1{
    static String brand = "Phillips";
    static double price = 1200;
    static String colour = "black";
    static boolean isOn;
	static int maxSize = 5;
	static int minSize;
	static int currentSize;
	
public static void isOn()
{
System.out.println("on or off");
if(isOn==false){
  isOn = true;
System.out.println("trimmer is on");
 }
 
 else if(isOn==true){
   isOn = false;
 }
}
public static void increaseSize()
   {
	   System.out.println("Increase size method started");
	   if(isOn==true)
	   {
		   System.out.println("Trimmer1 is turned off");
	   if(currentSize<maxSize){
		   currentSize = currentSize + 1;
		   System.out.println("Current size is () " +currentSize);
	    }  
		   else if(currentSize == maxSize){
			   System.out.println("max size reached");
		}
      }
        
			else if(isOn == false){
               System.out.println("On the trimmer");
			}			   
   }
   public static void decreaseSize()
   {
	     System.out.println("Decrease size method started");
		 if(isOn==true){
		   System.out.println("Trimmer1 is turned on");
		   if(currentSize>minSize){
			 currentSize = currentSize - 1;
			 System.out.println("Size is () "+currentSize);
		   }
		   
		  else if(currentSize == minSize){
			    System.out.println("Minimum size reached");
		  }
		 }
		    else if(isOn == false){
				
			  System.out.println("on the Trimmer");
			}	   
	   
   }   
   
  public static void main(String a[])
 {
 isOn();
 increaseSize();
 increaseSize();
 increaseSize();
 increaseSize();
 increaseSize();
 increaseSize();
 decreaseSize();
 decreaseSize();
 decreaseSize();
 decreaseSize();
 decreaseSize();
 decreaseSize();
 decreaseSize();
 }
}
 
