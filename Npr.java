class Npr{
public static void main(String a[]){
int npr = perm(5)/perm(5-2);
System.out.println(npr);
}
public static int perm(int permVal){
int p = 1;
for(int i=1;i<=permVal;i++){
p = p*i;
}
return p;
}
}