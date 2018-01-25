package com.ajeebsa.tabletop.item;

import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * {@link ItemRepository} implements mong repository for {@link item}. It provides CRUD
 * operation for {@link Item}.
 * 
 * @author Muhammad Ali Qasmi
 * @since 1.0.0
 */
public interface ItemRepository extends MongoRepository<Item, String>{

}
