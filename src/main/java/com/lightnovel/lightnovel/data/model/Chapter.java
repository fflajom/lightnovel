package com.lightnovel.lightnovel.data.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
	name="CHAPTER", 
	uniqueConstraints = {
		@UniqueConstraint(columnNames = { "title", "book_id" }),
		@UniqueConstraint(columnNames = { "number", "book_id" }) 
	}
)
public class Chapter extends BaseModel {
	
	private static final long serialVersionUID = 1L;

	@Column(name="title", nullable=false, length=200)
	private String title;

	@Column(name="number", nullable=false)
	private int number;
	
	@Column(name="style", nullable=false, length=20)
	private String style;
	
	@Column(name="content", nullable=true)
	private String content;
	
	@Column(name="publish_date", nullable=true)
	private Timestamp publishDate;
	
	@Column(name="is_final", nullable=false)
	private boolean isFinal;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="book_id", nullable=false)
	private Book book;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Timestamp publishDate) {
		this.publishDate = publishDate;
	}

	public boolean isFinal() {
		return isFinal;
	}

	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
