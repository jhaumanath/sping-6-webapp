package com.umanath.spring6webapp.repositories;

import com.umanath.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

    // This interface extends CrudRepository, which provides methods for CRUD operations
    // on Author entities. No additional methods are defined here, as the basic CRUD
    // operations are sufficient for this example.
}
