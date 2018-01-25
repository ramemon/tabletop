package com.ajeebsa.tabletop.person;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * {@link PersonRepository} implements mongo repository for {@link Person}. It provides CRUD
 * operation for {@link Person}.
 * 
 * @author Muhammad Ali Qasmi
 * @since 1.0.0
 */
public interface PersonRepository extends MongoRepository<Person, String> {

}
