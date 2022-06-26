class Mobile1Tester{
   public static void main (String a[]){
   Sony mob = new Sony();
   mob.price=21000;
   mob.ram="4GB";
   mob.batteryCapacity="4800mAh";
   mob.toCall();
   
   System.out.println(mob.price+" "+mob.ram+" "+mob.batteryCapacity);
   }
}