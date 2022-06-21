class BankWithdraw{
	static double balance = 5000;
    
  public static void main(String a[])
  {
    withDraw(1000);
  }
  
  
 static void withDraw(double amt){
	 System.out.println("Available amount"+ balance);
	 System.out.println("amount to be withdrawed"+ amt);
	 System.out.println("amount before withdraw"+ balance);
     balance = balance - amt;
System.out.println("available balance"+ balance);

}
}
  