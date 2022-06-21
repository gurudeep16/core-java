class TV1{
  static String brand = "samsung";
  static double price = 44500;
  static String color = "Black";
  static boolean isSwitchedOn;
  static int maxVolume = 5;
  static int minVolume;
  static int currentVolume;
  
 public static void onOrOff()
 {
 System.out.println("on or off");
     if(isSwitchedOn==false){
	 isSwitchedOn = true;
	 System.out.println("TV is turned on and available to watch");
}	 
	 else if(isSwitchedOn==true){
	 isSwitchedOn = false;
	 System.out.println("TV is turned off");
}
}
public static void increaseVolume()
   {
	   System.out.println("Increase volume method started");
	   if(isSwitchedOn==true)
	   {
		   System.out.println("TV is turned off");
	   if(currentVolume<maxVolume){
		   currentVolume = currentVolume + 1;
		   System.out.println("Current volume is () " +currentVolume);
	    }  
		   else if(currentVolume == maxVolume){
			   System.out.println("max volume reached");
		}
      }
        
			else if(isSwitchedOn == false){
               System.out.println("On the Tv");
			}			   
   }
   public static void decreaseVolume()
   {
	     System.out.println("Decrease volume method started");
		 if(isSwitchedOn==true){
		   System.out.println("speaker is turned on");
		   if(currentVolume>minVolume){
			 currentVolume = currentVolume - 1;
			 System.out.println("Volume is () "+currentVolume);
		   }
		   
		  else if(currentVolume == minVolume){
			    System.out.println("Minimum volume reached");
		  }
		 }
		    else if(isSwitchedOn == false){
				
			  System.out.println("on the speaker");
			}
	   
	   
	  
		   
	   
   }   
public static void main(String a[])
{
   onOrOff();
   onOrOff();
   onOrOff();
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
   decreaseVolume();
}
}