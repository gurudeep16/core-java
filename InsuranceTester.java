class InsuranceTester
{
public static void main(String a[])
{
Insurance insurance = new Insurance();
insurance.founder="Govt of India";
insurance.yearOfEstablish= 1956;
insurance.headQuater="Mumbai";
insurance.savings();
System.out.println(insurance.founder+ ":" +insurance.yearOfEstablish+ ":"+ insurance.headQuater);
}
}