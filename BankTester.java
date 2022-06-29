class BankTester{
  public static void main(String a[]){
   Bank sbi = new Sbi();
   sbi.interest(5); 

   Bank canara = new Canara();
   canara.interest(5);    
  
   Bank bob = new BankOfBaroda();
   bob.interest(5); 
   
   Bank hdfc = new Hdfc();
   hdfc.interest(5); 
   
   Bank syndicate = new Syndicate();
   syndicate.interest(5); 
   
   Bank union = new Union();
   union.interest(5); 
   
   Bank pnb = new Pnb();
   pnb.interest(5); 
   
   Bank bucb = new Bucb();
   bucb.interest(5); 
   
   Bank icici = new Icici();
   sbi.interest(5); 
   
   Bank yb = new YesBank();
   yb.interest(5); 
  }


}