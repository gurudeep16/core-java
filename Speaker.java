class Speaker{
  static String brand = "BOAT";
  static double price = 3000;
  static String color = "Black";
  static boolean isConnected;
  static int maxVolume = 6;
  static int minVolume = 0;
  static int currentVolume;
 public static void onOrOff()
 {
 System.out.println("on or off");
     if(isConnected==false){
	 isConnected = true;
	 System.out.println("Speaker is turned on and available to connect");
}	 
	 else if(isConnected==true){
	 isConnected = false;
	 System.out.println("Speaker is turned off");
}
 }
public static void increaseVolume()
   {
	   System.out.println("Increase volume method started");
	   if(isConnected==true)
	   {
		   System.out.println("Speaker is turned off");
	   if(currentVolume<maxVolume){
		   currentVolume = currentVolume + 1;
		   System.out.println("Current volume is () " +currentVolume);
	    }  
		   else if(currentVolume == maxVolume){
			   System.out.println("max volume reached");
		}
      }
        
			else if(isConnected == false){
               System.out.println("On the speaker");
			}			   
   }
   public static void decreaseVolume()
   {
	     System.out.println("Decrease volume method started");
		 if(isConnected==true){
		   System.out.println("speaker is turned on");
		   if(currentVolume>minVolume){
			 currentVolume = currentVolume - 1;
			 System.out.println("Volume is () "+currentVolume);
		   }
		   
		  else if(currentVolume == minVolume){
			    System.out.println("Minimum volume reached");
		  }
		 }
		    else if(isConnected == false){
				
			  System.out.println("on the speaker");
			}
	   
	   
	  
		   
	   
   }   
   
public static void main(String a[])
{
  onOrOff();
  increaseVolume();
  increaseVolume();
  increaseVolume();
  increaseVolume();
  increaseVolume();
  increaseVolume();
  increaseVolume();
  increaseVolume();
  increaseVolume();
  decreaseVolume();
   decreaseVolume();
  decreaseVolume();
  decreaseVolume();
  decreaseVolume();
  onOrOff();
  decreaseVolume();
   decreaseVolume();
    decreaseVolume();
  decreaseVolume();
}

	 
}
	  