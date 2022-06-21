class Torch{
    static String brand = "Everyday";
    static double price = 799;
    static String type = "LED";
    static boolean isOn;
	static int maxBrt = 3;
    static int minBrt;
    static int currentBrt;
	
public static void onOrOff()
{
System.out.println("on or off");
      if(isOn==false){
      isOn = true;
System.out.println("Torch is available for use");
  }

  else if(isOn == true){
  isOn = false;
  System.out.println("Torch is turned off");
 }
}
public static void increaseBrt()
   {
	   System.out.println("Increase brightness method started");
	   if(isOn==true)
	   {
		   System.out.println("Torch is turned off");
	   if(currentBrt<maxBrt){
		   currentBrt = currentBrt + 1;
		   System.out.println("Current brt is () " +currentBrt);
	    }  
		   else if(currentBrt == maxBrt){
			   System.out.println("max brt reached");
		}
      }
        
			else if(isOn == false){
               System.out.println("On the torch");
			}			   
   }
   public static void decreaseBrt()
   {
	     System.out.println("Decrease brightness method started");
		 if(isOn==true){
		   System.out.println("Brightness is turned on");
		   if(currentBrt>minBrt){
			 currentBrt = currentBrt - 1;
			 System.out.println("Brt is () "+currentBrt);
		   }
		   
		  else if(currentBrt == minBrt){
			    System.out.println("Minimum Brt reached");
		  }
		 }
		    else if(isOn == false){
				
			  System.out.println("on the brt");
			}
	   
	   
	  
		   
	   
   }   
 public static void main(String a[])
 {
   onOrOff();
   onOrOff();
   onOrOff();			
   System.out.println(brand);
   System.out.println(price);
   System.out.println(type);
   increaseBrt();
   increaseBrt();
   increaseBrt();
   decreaseBrt();
   decreaseBrt();
   decreaseBrt();
   decreaseBrt();
 }
}
 
 
