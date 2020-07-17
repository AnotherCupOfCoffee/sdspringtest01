package de.sdspring.test;

import java.util.Collection;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface BookRepository extends Repository<Book, Integer> {

	/**
	 * Retrieve all <code>Book</code>s from the data store.
	 * @return a <code>Collection</code> of <code>Book</code>s
	 */
	@Transactional(readOnly = true)
	@Cacheable("tab_master")
	Collection<Book> findAll() throws DataAccessException;

}
