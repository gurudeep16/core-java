class Bar{
 String name;
 String address;
 long contactNo;
 String ownerName;
 String brands[] = {"Kingfisher","Imperial blue","OT","BP"};
  String brands1[] = {"Bacardi","Ketel One","Royal Challenge"};
   

public static void main(String a[]){
	Bar bar = new Bar();
bar.name = "Boozy Griffin";
bar.address = "Rajajinagar Bangalore";
bar.contactNo = 9859863651L;
bar.ownerName = "Sanjay rao";

System.out.println("Bar Name "+bar.name);
System.out.println("Bar Address" +bar.address);
System.out.println("Bar contactNo "+bar.contactNo);
System.out.println("Owner name " +bar.ownerName);
bar.getBrands();

Bar bar1 = new Bar();
bar1.name = "Bobs bar";
bar1.address = "Indiranagar Bangalore";
bar1.contactNo = 9859863651L;
bar1.ownerName = "Darshan sinha";

System.out.println("Bar Name "+bar1.name);
System.out.println("Bar Address" +bar1.address);
System.out.println("Bar contactNo "+bar1.contactNo);
System.out.println("Owner name " +bar1.ownerName);
bar1.getBrands1();


}
public void getBrands(){
	for(int i=0;i<brands.length;i++){
		System.out.println(brands[i]);
	}
}

public void getBrands1(){
	for(int j=0;j<brands1.length;j++){
		System.out.println(brands1[j]);
	}
}


}