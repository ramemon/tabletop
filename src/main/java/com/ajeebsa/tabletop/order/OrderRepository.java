
package com.ajeebsa.tabletop.order;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * {@link OrderRepository} implements mong repository for {@link Order}. It provides CRUD
 * operation for {@link Order}.
 * 
 * @author Muhammad Ali Qasmi
 * @since 1.0.0
 */
public interface OrderRepository extends MongoRepository<Order, String> {

}
