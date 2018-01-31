package com.ubiqum.SpringAnnotations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByAuthor(String authorName);
	List<Book> findByBookshelfLocation (String location);
	List<Book> findByTitleContaining (String text);
}
