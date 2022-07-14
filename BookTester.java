import java.util.Scanner;
class BookTester
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the books");
		int size = sc.nextInt();		
		Library lb = new Library(size);
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter ID of the book");
			int id=sc.nextInt();
			
			System.out.println("Enter name of the book");
			String name=sc.next();
			
			System.out.println("Enter name of the Author");
			String author=sc.next();
			
			System.out.println("Enter the year of publish");
			String publishedIn=sc.next();
			
			System.out.println("Enter stream of the book");
			String stream=sc.next();
			
			BookDTO bk = new BookDTO();
			bk.setId(id);
			bk.setName(name);
			bk.setAuthor(author);
			bk.setPublishedIn(publishedIn);
			bk.setStream(stream);
			lb.readAndGrow(bk);
		}
		
		lb.getBooks();
		 System.out.println("enter existing id");
		 int existingId = sc.nextInt();
		 System.out.println("enter new name");
		 String updatedName = sc.next();
		lb.updateNamesById(existingId,updatedName);
		lb.getBooks();
	}
	
}