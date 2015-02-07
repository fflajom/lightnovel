package com.lightnovel.lightnovel.data.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="GENRE")
public class Genre extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	@Column(name="name", nullable=false, unique=true, length=100)
	private String name;
	
	@ManyToMany(fetch=FetchType.LAZY, mappedBy="genres")
	private List<Book> books = new ArrayList<Book>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Book> getBooks() {
		return books;
	}
	
}
