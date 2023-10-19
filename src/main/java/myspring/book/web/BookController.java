package myspring.book.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import myspring.book.domain.BookVO;
import myspring.book.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/bookList.do")
	public ModelAndView bookList() {
		List<BookVO> bookList = bookService.getBookList();
		return new ModelAndView("bookList", "bookList", bookList);
	}
	
	@RequestMapping("/getBook.do")
	public String getBook(@RequestParam("id") int id, Model model) {
		BookVO book = bookService.getBook(id);
		model.addAttribute("book", book);
		return "bookInfo";
	}
}
