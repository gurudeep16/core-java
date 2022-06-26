class ModeOfTransportTester{
 public static void main(String a[]){
   Ksrtc bus = new Ksrtc();
   bus.ticketPrice=960;
   bus.coach="Luxury";
   bus.seatingCapacity=49;
   bus.toTravel();
  
  System.out.println(bus.ticketPrice+" "+bus.coach+" "+bus.seatingCapacity);
 
 }

}