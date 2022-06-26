class TestingToolTester{
 public static void main(String a[]){
   Selenium se = new Selenium();
   se.startedIn=2006;
   se.type="Object Oriented";
   se.designedBy="Simon Stewert";
   se.forTesting();
  
  System.out.println(se.startedIn+" "+se.type+" "+se.designedBy);
 
 }

}