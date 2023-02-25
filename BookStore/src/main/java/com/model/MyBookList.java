package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="MyBooks")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyBookList {
	@Id
	private int id;
	private String name;
	private String author;
	private String price;
	

}
