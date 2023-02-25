package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Book;
import com.repository.BookRepository;



@Service
public class BookService {
	@Autowired
	private BookRepository bRepo;
	public void save(Book b) {
		bRepo.save(b);
	}
	public List<Book> getallBook(){
		
		return bRepo.findAll();
	}
public Book getBookById(int id){
	return bRepo.findById(id).get();
	//we can the method get which will return the book object
}
public void deleteById(int id) {
	bRepo.deleteById(id);
}
}
