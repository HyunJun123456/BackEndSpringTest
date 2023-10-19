package myspring.book.service;

import java.util.List;

import myspring.book.domain.BookVO;

public interface BookService {
	// 책 조회 (1개)
	public BookVO getBook(int id);
	
	// 책 여러개 조회
	public List<BookVO> getBookList();
}
