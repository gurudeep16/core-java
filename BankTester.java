class BankTester
{
public static void main(String a[])
{
Bank1 bk = new Bank1();
bk.sector="Govt";
bk.yearOfEstablish= 1806;
bk.noOfEmploy=245642;
bk.bank();
System.out.println(bk.sector+ ":" +bk.yearOfEstablish+ ":"+ bk.noOfEmploy);

}


}