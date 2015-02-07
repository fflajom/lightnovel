package com.lightnovel.lightnovel.data.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Writer extends User {
	
	private static final long serialVersionUID = 1L;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="writer")
	private List<Book> books = new ArrayList<Book>();

	public List<Book> getBooks() {
		return books;
	}

}
