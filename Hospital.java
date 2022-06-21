class Hospital{
 String name;
 String address;
 long contactNo;
 String ownerName;
 String availableDepartment[] = {"Cardiology","ENT","General","Gynecologist"};
  String availableDepartment1[] = {"Cardiology","ENT","General","Gynecologist","Orthopeadics","Urology"};
   

public static void main(String a[]){
	Hospital hospital = new Hospital();
hospital.name = "Ayu Multi Speciality Hospital";
hospital.address = "Bellandur Bangalore";
hospital.contactNo = 9859863651L;
hospital.ownerName = "Karan Gupta";

System.out.println("Name " +hospital.name);
System.out.println("Address "+hospital.address);
System.out.println("Conact no " +hospital.contactNo);
System.out.println("Owner" +hospital.ownerName);
hospital.getAvailableDepartment();
System.out.println("---------------------------------------");

Hospital hospital1 = new Hospital();
hospital1.name = "Fortis";
hospital1.address = "Rajajinagar";
hospital1.contactNo = 8456987851L;
hospital1.ownerName = "IHH health care";

System.out.println("Name " +hospital1.name);
System.out.println("Address " +hospital1.address);
System.out.println("Conact no "+hospital1.contactNo);
System.out.println("Owner " +hospital1.ownerName);
hospital1.getAvailableDepartment1();



}
public void getAvailableDepartment(){
	for(int i=0;i<availableDepartment.length;i++){
		System.out.println(availableDepartment[i]);
	}
}

public void getAvailableDepartment1(){
	for(int j=0;j<availableDepartment1.length;j++){
		System.out.println(availableDepartment1[j]);
	}
}


}