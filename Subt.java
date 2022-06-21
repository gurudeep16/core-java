class Subt{
public static void main(String a[]){
   int no2= sub(55,45);
   System.out.println("ans is " +no2);
   int no3= sub3(255,65,45);
   System.out.println("ans is " +no3);

}
 public static int sub(int a,int b){
 return a-b;
 }
 public static int sub3(int a,int b,int c){
 return a-b-c;
 }

}