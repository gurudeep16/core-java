class Grinder{
  static String brand = "Preeti";
  static double price = 7389;
  static String color = "grey";
  static boolean isTurnedOn;
  static int maxSpeed = 3;
  static int minSpeed;
  static int currentSpeed;
  
 public static void onOrOff()
 {
 System.out.println("on or off");
     if(isTurnedOn==false){
	 isTurnedOn = true;
	 System.out.println("Grinder is turned on and available to connect");
}	 
	 else if(isTurnedOn==true){
	 isTurnedOn = false;
	 System.out.println("Grinder is turned off");
}
}
public static void increaseSpeed()
   {
	   System.out.println("Increase speed	   method started");
	   if(isTurnedOn==true)
	   {
		   System.out.println("grinder is turned off");
	   if(currentSpeed<maxSpeed){
		   currentSpeed = currentSpeed + 1;
		   System.out.println("Current speed is () " +currentSpeed);
	    }  
		   else if(currentSpeed == maxSpeed){
			   System.out.println("max speed reached");
		}
      }
        
			else if(isTurnedOn == false){
               System.out.println("On the Grinder");
			}			   
   }
   public static void decreaseSpeed()
   {
	     System.out.println("Decrease speed method started");
		 if(isTurnedOn==true){
		   System.out.println("Grinder is turned on");
		   if(currentSpeed>minSpeed){
			 currentSpeed = currentSpeed - 1;
			 System.out.println("speed is () "+currentSpeed);
		   }
		   
		  else if(currentSpeed == minSpeed){
			    System.out.println("Minimum speed reached");
		  }
		 }
		    else if(isTurnedOn == false){
				
			  System.out.println("on the grinder");
			}
	   
	   
	  
		   
	   
   }   
public static void main(String a[])
{
   onOrOff();
   onOrOff();
   onOrOff();
   increaseSpeed();
   increaseSpeed();
	increaseSpeed();
	increaseSpeed();
   decreaseSpeed();
   decreaseSpeed();
   decreaseSpeed();
   decreaseSpeed();
}
}