class NovelTester{
	public static void main(String a[]){
		
		NovelDTO no = new NovelDTO();
		no.setName("2 States");
		no.setType("Romance comedy");
		no.setPrice(499);
		no.setAuthor("Chetan Bhagat");
		no.setEdition(1);
		
		
		System.out.println(no.getName()+":"+no.getType()+":"+no.getPrice()+":"+no.getAuthor()+":"+no.getEdition());
		//no.read();
	}
	
	
}