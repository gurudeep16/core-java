class Ncr{
public static void main(String a[]){
int ncr = comb(5)/(comb(5-2)*comb(2));
System.out.println(ncr);
}
public static int comb(int combVal){
int c = 1;
for(int i=1;i<=combVal;i++){
c = c*i;
}
return c;
}
}