class ElectronicDeviceTester{
    public static void main(String a[]){
	  Tubelight1 tube = new Tubelight1();
	  tube.price=799;
	  tube.type="LED";
	  tube.capacity="24 Watts";
	  tube.toGetLight();
	  
System.out.println(tube.price+" "+tube.type+" "+tube.capacity);
	}

}