class Library
{
	BookDTO[] dtos;
	int index ;
	public Library(int size)
	{
		System.out.println("Constructor created");
		dtos= new BookDTO[size];
	}
	
	public boolean readAndGrow(BookDTO bk)
	{
		boolean books=false;
		if(bk != null)
		{
			dtos[index++]=bk;
			books = true;
			System.out.println("Book added successfully");
		}
		else
		{
			System.out.println("Details update maad saayi");
		}
		return books;
	}
	public void getBooks()
	{
		for(int i=0;i<dtos.length;i++)
		{
			System.out.println(dtos[i].getId()+ " : "+dtos[i].getName()+ " : "+dtos[i].getAuthor()+ " : "+dtos[i].getPublishedIn()+ ": "+dtos[i].getStream());
		}
	}
}
