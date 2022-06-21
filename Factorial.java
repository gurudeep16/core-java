class Factorial{
public static void main(String a[]){
int factVal = fact(5);
System.out.println(factVal);

}
public static int fact(int factNum){
int f=1;
for(int i=1;i<=factNum;i++){
f =f*i;
}
return f;
}

}