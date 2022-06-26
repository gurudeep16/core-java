class WebTechTester{
public static void main(String a[]){
  Html ht = new Html();
  ht.manage="Website and browser";
  ht.basedOn="Server and Client";
  ht.markUpLang();
  
  System.out.println(ht.manage+" "+ht.basedOn);
}
}