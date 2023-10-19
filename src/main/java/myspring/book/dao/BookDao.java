package myspring.book.dao;

import java.util.List;

import myspring.book.domain.BookVO;

public interface BookDao {
	public List<BookVO> readAll();
	public BookVO read(int id);
}
