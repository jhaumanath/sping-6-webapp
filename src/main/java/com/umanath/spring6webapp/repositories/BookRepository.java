package com.umanath.spring6webapp.repositories;

import com.umanath.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    // This interface extends CrudRepository, which provides methods for CRUD operations
    // on Book entities. No additional methods are defined here, as the basic CRUD
    // operations are sufficient for this example.
}
