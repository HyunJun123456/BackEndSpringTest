package myspring.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.book.dao.BookDao;
import myspring.book.domain.BookVO;
@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookDao;
	
	// 책 조회 (1개)
	@Override
	public BookVO getBook(int id) {
		return bookDao.read(id);
	}

	// 책 여러개 조회
	@Override
	public List<BookVO> getBookList() {
		return bookDao.readAll();
	}

}
