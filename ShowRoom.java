class ShowRoom{
String name;
String type;
String address;
int noOfEmployee;
long contactNo;

public static void main(String a[]){
    ShowRoom show = new ShowRoom();
	show.name="Bajaj";
	show.type = "Bike";
	show.address = "Rajajinagar";
	show.noOfEmployee = 17;
	show.contactNo = 9842769563L;
	
System.out.println("Name :"+show.name +" Type :" +show.type +" Address :" +show.address +" No of employees :" +show.noOfEmployee +" Conact no :" +show.contactNo);

  ShowRoom show1 = new ShowRoom();
  show1.name = "Maruti Suzuki";
  show1.type = "Car";
  show1.address = "Vijaynagar";
  show1.noOfEmployee = 29;
  show1.contactNo = 8971399568L;
  
System.out.println("Name :"+show1.name +" Type :" +show1.type +" Address :" +show1.address +" No of employees :" +show1.noOfEmployee +" Conact no :" +show1.contactNo);

ShowRoom show2 = new ShowRoom();
  show2.name = "Audi";
  show2.type = "Car";
  show2.address = "Brigade Road";
  show2.noOfEmployee = 36;
  show2.contactNo = 8603223220L;
  
System.out.println("Name :"+show2.name +" Type :" +show2.type +" Address :" +show2.address +" No of employees :" +show2.noOfEmployee +" Conact no :" +show2.contactNo);

ShowRoom show3 = new ShowRoom();
  show3.name = "Yamaha";
  show3.type = "Bike";
  show3.address = "HSR layout";
  show3.noOfEmployee = 19;
  show3.contactNo = 9520630630L;
  
System.out.println("Name :"+show3.name +" Type :" +show3.type +" Address :" +show3.address +" No of employees :" +show3.noOfEmployee +" Conact no :" +show3.contactNo);
  
  
}

}