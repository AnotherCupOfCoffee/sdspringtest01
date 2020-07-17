package de.sdspring.test;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Books {

	private List<Book> books;

	@XmlElement
	public List<Book> getBookList() {
		if (books == null) {
			books = new ArrayList<>();
		}
		return books;
	}

}
