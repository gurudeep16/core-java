class VCSTester{

public static void main(String a[]){
   Git g = new Git();
   g.type="Source Control";
   g.used="Track and manage changes to code";
   g.toUploadCode();
   
   System.out.println(g.type+" "+g.used);
}
}