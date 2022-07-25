package com.xworkz.library.crud;

import com.xworkz.library.dto.BooksDTO;

public interface Library {
	public void getBooks();
	public boolean updateBookNameById(int id , String name);
	boolean deleteBookByName(String name);
	boolean deleteBookByAuthor(String author);
	public boolean readAndGrow(BooksDTO bk);

}
