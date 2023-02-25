package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.MyBookList;
import com.repository.MyBookRepository;

@Service
public class MyBookListService {
	@Autowired
	private MyBookRepository mybook;
	public void saveMyBooks(MyBookList book) {
		mybook.save(book);
	}
	public List<MyBookList> getallMyBooks() {
		// TODO Auto-generated method stub
		return mybook.findAll();
	}
public void deleteById(int id) {
	mybook.deleteById(id);
}
}
