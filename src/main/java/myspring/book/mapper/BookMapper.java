package myspring.book.mapper;

import java.util.List;

import myspring.book.domain.BookVO;

public interface BookMapper {
	BookVO selectBookById(int id);
	List<BookVO> selectBookList();
}
