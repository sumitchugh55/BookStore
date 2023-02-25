package com.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.MyBookListService;

@Controller
public class MyBookListController {
	@Autowired
	private MyBookListService service;
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable int id) {
		service.deleteById(id);
		return "redirect:/my_books";
	}

}
