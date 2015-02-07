package com.lightnovel.lightnovel.data.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="BOOK")
public class Book extends BaseModel {

	private static final long serialVersionUID = 1L;
	
	@Column(name="title", nullable=false, unique=true, length=200)
	private String title;
	
	@Column(name="publish_date", nullable=true)
	private Timestamp publishDate;
	
	@Column(name="synopsis", nullable=false)
	private String synopsis;
	
	@Column(name="is_premium", nullable=false)
	private boolean isPremium;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="user_id", nullable=false)
	private Writer writer;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="book")
	private List<Chapter> chapters = new ArrayList<Chapter>();
	
	@ManyToMany(fetch=FetchType.LAZY, mappedBy="subscriptions")
	private List<Reader> subscribers = new ArrayList<Reader>();
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(
		name = "BOOK_GENRE_ASSN", 
		joinColumns = { @JoinColumn(name="book_id", nullable=false, updatable=false) }, 
		inverseJoinColumns = { @JoinColumn(name = "genre_id", nullable=false, updatable=false) }
	)
	private List<Genre> genres = new ArrayList<Genre>();
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="book")
	private List<Tag> tags = new ArrayList<Tag>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Timestamp publishDate) {
		this.publishDate = publishDate;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}

	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}
	
	public List<Chapter> getChapters() {
		return chapters;
	}
	
	public List<Reader> getSubscribers() {
		return subscribers;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public List<Tag> getTags() {
		return tags;
	}

}
