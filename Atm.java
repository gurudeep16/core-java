class Atm
{
String type;
String bank;
int noOfMachine;
public static void main(String a[])
{
Atm atm =new Atm();
atm.bank="HDFC";
atm.type="Deposit";
atm.noOfMachine=2;


System.out.println("Bank Name is " +atm.bank + " Machine type  " +atm.type + " No of machine " +atm.noOfMachine);
System.out.println("---------------------------------------------------");

Atm atm1 =new Atm();
atm1.bank="SBI";
atm1.type="Deposit & Withdraw";
atm1.noOfMachine=3;


System.out.println("Bank Name is " +atm1.bank + " Machine type  " +atm1.type + " No of machine " +atm1.noOfMachine);
System.out.println("---------------------------------------------------");

Atm atm2 =new Atm();
atm2.bank="ICICI";
atm2.type="Withdraw";
atm2.noOfMachine=2;


System.out.println("Bank Name is " +atm2.bank + " Machine type  " +atm2.type + " No of machine " +atm2.noOfMachine);
System.out.println("---------------------------------------------------");

}

}