class ChipManufactureCompanyTester{
 public static void main(String a[]){
   TSM te = new TSM();
   te.ownedBy="Morris chang";
   te.chipType="semiconductor";
   te.turnOver="$58.43 billion";
   te.microChip();
  
  System.out.println(te.ownedBy+" "+te.chipType+" "+te.turnOver);
 
 }

}