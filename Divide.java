class Divide{
public static void main(String a[]){
double no2 = div(56,25);
System.out.println("Ans is()" +no2);
double no3 = div(66,2,2); 
System.out.println("Ans is()" +no3);
}
public static double div(double a,double b){
return a/b;
}
public static double div(double a,double b,double c){
return a/b/c;
}
}


