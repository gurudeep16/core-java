class AC1{
  static String brand = "Voltas";
  static double price = 33499;
  static String color = "white";
  static boolean isOn;
  static int maxTemp = 24;
  static int minTemp = 16;
  static int currentTemp = 15;
  
 public static void onOrOff()
 {
 System.out.println("on or off");
     if(isOn==false){
	 isOn = true;
	 System.out.println("AC is turned on and available to use");
}	 
	 else if(isOn==true){
	 isOn = false;
	 System.out.println("Ac is turned off");
}
}
public static void increaseTemp()
   {
	   System.out.println("Increase temp method started");
	   if(isOn==true)
	   {
		   System.out.println("AC is turned off");
	   if(currentTemp<maxTemp){
		   currentTemp = currentTemp + 1;
		   System.out.println("Current temp is () " +currentTemp);
	    }  
		   else if(currentTemp == maxTemp){
			   System.out.println("max temp reached");
		}
      }
        
			else if(isOn == false){
               System.out.println("On the ac");
			}			   
   }
   public static void decreaseTemp()
   {
	     System.out.println("Decrease temp method started");
		 if(isOn==true){
		   System.out.println("ac is turned on");
		   if(currentTemp>minTemp){
			 currentTemp = currentTemp - 1;
			 System.out.println("temp is () "+currentTemp);
		   }
		   
		  else if(currentTemp == minTemp){
			    System.out.println("Minimum temp reached");
		  }
		 }
		    else if(isOn == false){
				
			  System.out.println("on the ac");
			}
	   
		   
	   
   }   
public static void main(String a[])
{
   onOrOff();
   onOrOff();
   onOrOff();
   increaseTemp();
   increaseTemp();
   increaseTemp();
   increaseTemp();
   increaseTemp();
   increaseTemp();
   increaseTemp();
   decreaseTemp();
   decreaseTemp();
   decreaseTemp();
   decreaseTemp();
   decreaseTemp();
   decreaseTemp();
}
}