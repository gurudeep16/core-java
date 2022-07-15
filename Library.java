import java.util.Arrays;
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
	public boolean updateBookNameById(int id , String name)
	{
		boolean updatedName=false;
		for(int i=0;i<dtos.length;i++)
		{
			if(dtos[i].getId() == id)
			{
				System.out.println("Name Updated successfully");
				dtos[i].setName(name);
				updatedName=true;				
			}
			else
			{
				System.out.println("ID is not matching please put vallid one");
			}
		}
		return updatedName;
	}
	boolean deleteBookByName(String name)
	{ 
		boolean deleteBook=false;
		int i , j;
		for( i=0,j=0;j<dtos.length;j++)
		{
			if(!dtos[j].getName().equals(name))
			{				
				dtos[i++]=dtos[j];
				deleteBook=true;
				System.out.println("Deleted successfully");				
			}         						
		}
		dtos=Arrays.copyOf(dtos,i);
		return deleteBook;
	}	
	boolean deleteBookByAuthor(String author)
	{ 
		boolean deleteBook=false;
		int i , j;
		for( i=0,j=0;j<dtos.length;j++)
		{
			if(!dtos[j].getAuthor().equals(author))
			{				
				dtos[i++]=dtos[j];
				deleteBook=true;
				System.out.println("Deleted successfully");				
			}
         						
		}
		dtos=Arrays.copyOf(dtos,i);
		return deleteBook;
	}
}










