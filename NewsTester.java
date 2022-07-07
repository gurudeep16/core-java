class NewsTester{
	public static void main(String a[]){
		
		NewspaperDTO np = new NewspaperDTO();
		np.setName("Prajavani");
		np.setType("Daily");
		np.setPrice(6.50);
		np.setPublications("Deccan Herald");
		np.setLanguage("Kannada");
		
		
		System.out.println(np.getName()+":"+np.getType()+":"+np.getPrice()+":"+np.getPublications()+":"+np.getLanguage());
		//np.read();
	}
	
	
}