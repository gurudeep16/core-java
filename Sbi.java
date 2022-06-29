class Sbi extends Bank{
   @Override
   public void interest(double intrest){
   System.out.println("Sbi");
   intrest=intrest+2.5;
   
   super.interest(intrest);
   }

}