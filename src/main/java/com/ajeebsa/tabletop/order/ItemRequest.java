
package com.ajeebsa.tabletop.order;

import static com.ajeebsa.tabletop.order.ItemRequest.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ajeebsa.tabletop.AbstractMongoEntity;
import com.ajeebsa.tabletop.item.Item;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link ItemRequest} implements POJO for request of items.
 * 
 * @author Muhammad Ali Qasmi
 * @since 1.0.0
 */
@Document(collection = COLLECTION_NAME)
public class ItemRequest extends AbstractMongoEntity<ObjectId> {
    
    private static final long serialVersionUID = -6105510783166805968L;

    public static final String COLLECTION_NAME = "itemRequests";
    
    @Valid
    @NotNull(message = "item is required.")
    private final Item item;
    
    @NotNull(message = "quantity is required.")
    private final Integer quantity;

    /**
     * Creates {@link ItemRequest} object
     * 
     * @param item Item requested
     * @param quantity Quantity of requested item
     */
    @JsonCreator
    public ItemRequest(@JsonProperty("item")Item item, //
            @JsonProperty("quantity")Integer quantity) {
        super();
        this.item = item;
        this.quantity = quantity;
    }

    
    /**
     * @return the item
     */
    public final Item getItem() {
        return item;
    }

    
    /**
     * @return the quantity
     */
    public final Integer getQuantity() {
        return quantity;
    }
    
}
