class Mall{
  String name;
  String address;
  long contactNo;
  String ownerName;
  String shopNames[] = {"Puma","Adidas","KFC","Pantaloons","Zara","Dominoz"};
  String shopNames2[] = {"Puma","Adidas","KFC","Pantaloons","Zara","Dominoz","Pizza Hut"};
  String shopNames3[] = {"Puma","Adidas","KFC","Pantaloons","Zara","Dominoz","Nike","Apple store"};
  
  public static void main(String a[]){
  Mall mall1 = new Mall();
  mall1.name = "Orion";
  mall1.address = "Rajajinagar Bengaluru";
  mall1.contactNo = 8067282222L;
  mall1.ownerName = "Brigade Gateway";
   
  System.out.println("Mall name is  " +mall1.name);
  System.out.println("Mall address is " +mall1.address);
  System.out.println("Mall contactNo is " +mall1.contactNo);
  System.out.println("Mall ownerName is " +mall1.ownerName);
  mall1.getShopNames();
   System.out.println("---------------------------------------");
  
  Mall mall2 = new Mall();
  mall2.name = "Mantri Square";
  mall2.address = "Malleshwaram Bengaluru";
  mall2.contactNo = 9845978635L;
  mall2.ownerName = "Sushil Mantri";
  
    System.out.println("Mall name is  " +mall2.name);
  System.out.println("Mall address is " +mall2.address);
  System.out.println("Mall contactNo is " +mall2.contactNo);
  System.out.println("Mall ownerName is " +mall2.ownerName);
  mall2.getShopNames2();
  System.out.println("---------------------------------------");
  
  Mall mall3 = new Mall();
  mall3.name = "LuLu Hypermarket";
  mall3.address = "Rajajinagar Bengaluru";
  mall3.contactNo = 484667666L;
  mall3.ownerName = "Yusuff ali";
  
  System.out.println("Mall name is  " +mall3.name);
  System.out.println("Mall address is " +mall3.address);
  System.out.println("Mall contactNo is " +mall3.contactNo);
  System.out.println("Mall ownerName is " +mall3.ownerName);
  mall3.getShopNames3();
   System.out.println("---------------------------------------");
  }
  
  public void getShopNames(){
  for(int i=0;i<shopNames.length;i++){
  System.out.println("Shops in Mall "+shopNames[i]);
  }
  }
  
   public void getShopNames2(){
  for(int j=0;j<shopNames2.length;j++){
  System.out.println("Shops in Mall "+shopNames2[j]);
  }
  }
  
   public void getShopNames3(){
  for(int k=0;k<shopNames3.length;k++){
  System.out.println("Shops in Mall "+shopNames3[k]);
  }
  }
  
  

  }


