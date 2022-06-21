class WM{
static int increSpd=3;
static int decreSpd;
static int curntSpd;
static boolean isOn;
public static void isOn()
{
if(isOn==false){
isOn=true;
System.out.println("available for use");
}
else if(isOn==true){
isOn=false;
System.out.println("is turned off");
}
}
public static void increSpd()
{
	System.out.println("increse spd started");
  if(isOn==true){
	
	System.out.println("is on");
	if(curntSpd<increSpd){
	curntSpd=curntSpd+1;
	System.out.println("crnt spd " +curntSpd);
	} 
	else if(curntSpd==increSpd) 
		System.out.println("max rchd");
  }	
	else if(isOn==false)
		System.out.println("on it");
	
	
	
}


public static void main(String a[])
{
isOn();
increSpd();
increSpd();
increSpd();
increSpd();
}





}