package com.ubiqum.SpringAnnotations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BookshelfRepository extends JpaRepository<Bookshelf, Long> {
	List<Bookshelf> findByCapacityGreaterThan (Integer minimum);
}
