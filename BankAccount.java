class BankAccount{
static double amount;


public static void main(String a[]){
System.out.println("main Method started");
 deposit(7000);
  deposit(9000);
  System.out.println("Main Method Ended");

}
   
   
   static void deposit(double amt){
   
System.out.println("Invoked deposit()"+ amt);
System.out.println("Amount to be deposited"+ amt);
System.out.println("Amount before deposit"+ amount);
  amount = amount + amt;
System.out.println("Available balance" + amount);
}
}