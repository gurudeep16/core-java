import java.util.Scanner;
class Airport1Tester{
	
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("terminals");
		int size = sc.nextInt();
		
		Airport1 a1 = new Airport1(size);
		for(int i=0;i<size;i++){
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter type");
		String type = sc.next();
		System.out.println("enter Airport Name");
		String airportName = sc.next();
		System.out.println("no of entry");
		int noOfEntry = sc.nextInt();
		System.out.println("no of exit");
		int noOfExit = sc.nextInt();
		
		
		TerminalDTO td = new TerminalDTO();
		td.setId(id);
		td.setType(type);
		td.setAirportName(airportName);
		td.setNoOfEntry(noOfEntry);
		td.setNoOfExit(noOfExit);
		
		a1.terminals(td);
						
		}
		
		a1.getTerminalDetails();
	}

}