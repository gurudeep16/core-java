class InstitutionTester
{
public static void main(String a[])
{
Institution institution = new Institution();
institution.founder="Omkar";
institution.yearOfEstablish= 2019;
institution.headQuater="Bengaluru";
institution.javaClass();
System.out.println(institution.founder+ ":" +institution.yearOfEstablish+ ":"+ institution.headQuater);
}
}