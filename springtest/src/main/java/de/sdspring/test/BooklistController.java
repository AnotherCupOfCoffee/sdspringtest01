package de.sdspring.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
class BooklistController {

	private final BookRepository books;

	public BooklistController(BookRepository libraryService) {
		this.books = libraryService;
	}

	@GetMapping("/booklist.html")
	public String showBookList(Map<String, Object> model) {
		// Here we are returning an object of type 'Books' rather than a collection of
		// Book
		// objects so it is simpler for Object-Xml mapping
		Books books = new Books();
		books.getBookList().addAll(this.books.findAll());
		model.put("books", books);
		return "booklist";
	}

	@GetMapping({ "/booklist" })
	public @ResponseBody Books showResourcesBookList() {
		// Here we are returning an object of type 'Books' rather than a collection of
		// Book
		// objects so it is simpler for JSon/Object mapping
		Books books = new Books();
		books.getBookList().addAll(this.books.findAll());
		return books;
	}

	@GetMapping("/booklist2.html")
	public String showBookList2(Map<String, Object> model) {
		// Here we are returning an object of type 'Books' rather than a collection of
		// Book
		// objects so it is simpler for Object-Xml mapping
		//Books books = new Books();
		//books.getBookList().addAll(this.books.findAll());
		//model.put("books", books);
		return "booklist2";
	}
	
}
