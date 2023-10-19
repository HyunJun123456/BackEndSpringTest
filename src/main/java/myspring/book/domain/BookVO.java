package myspring.book.domain;

import java.time.LocalDateTime;
import java.util.Date;

public class BookVO {
	private int id;
	private String title;
	private String author;
	private String isbn;
	private String genre;
	private LocalDateTime created_at;
	public BookVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookVO(int id, String title, String author, String isbn, String genre, LocalDateTime created_at) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.genre = genre;
		this.created_at = created_at;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public LocalDateTime getCreatedAt() {
		return created_at;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.created_at = createdAt;
	}
	@Override
	public String toString() {
		return "BookVO [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", genre=" + genre
				+ ", created_at=" + created_at + "]";
	}
	
	
	
}
