package myspring.book.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.book.domain.BookVO;
import myspring.book.mapper.BookMapper;
@Repository
public class BookDaoImpl implements BookDao{

	@Autowired
	private BookMapper bookMapper;
	
	// 전체 책 조회
	@Override
	public List<BookVO> readAll() {
		List<BookVO> bookList = bookMapper.selectBookList();
		return bookMapper.selectBookList();
	}

	// 책 하나 조회
	@Override
	public BookVO read(int id) {
		return bookMapper.selectBookById(id);
	}

}
