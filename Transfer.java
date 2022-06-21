class Transfer{
	static double amount = 5000;
    
  public static void main(String a[])
  {
    withDraw(1000);
	getTotalAmount();
	deposit(3000);
	getTotalAmount();
	deposit(80000);
	getTotalAmount();
	withDraw(5000);
	getTotalAmount();
	deposit(45000);
	getTotalAmount();
	deposit(50000);
	getTotalAmount();
	withDraw(10000);
	getTotalAmount();
	deposit(500000);
	getTotalAmount();
	withDraw(45000);
	getTotalAmount();
	deposit(100000);
	getTotalAmount();
  }
  
  
 static void withDraw(double amt){
	 System.out.println("Available amount"+ amount);
	 System.out.println("amount to be withdrawed"+ amt);
	 System.out.println("amount before withdraw"+ amount);
     amount = amount - amt;
System.out.println("available balance"+amount);

}
  static void deposit(double amt){
   
System.out.println("Invoked deposit()"+ amt);
System.out.println("Amount to be deposited"+ amt);
System.out.println("Amount before deposit"+ amount);
  amount = amount + amt;
System.out.println("Available balance" + amount);
}
   static void getTotalAmount()
   {
	   System.out.println("Total amount" +amount);
   }
}