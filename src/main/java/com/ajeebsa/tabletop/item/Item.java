
package com.ajeebsa.tabletop.item;

import static com.ajeebsa.tabletop.item.Item.*;

import java.util.Map;

import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ajeebsa.tabletop.AbstractMongoEntity;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Item} implements POJO for food items.
 * 
 * @author Muhammad Ali Qasmi
 * @since 1.0.0
 */
@Document(collection = COLLECTION_NAME)
public class Item extends AbstractMongoEntity<ObjectId>{

    private static final long serialVersionUID = 7359352334842921208L;

    public static final String COLLECTION_NAME = "items";
    
    private final String name;
    
    @NotNull(message = "price is required.")
    private final float price;
    
    @NotNull(message = "discount is required.")
    private final float discount;

    @NotNull(message = "description is required.")
    private final String description;

    private final Map<String, String> metadata;

    /**
     * Creates item object.
     * 
     * @param name Name of item
     * @param price Price of item
     * @param discount Discount on item price in percentage
     * @param description Description on item
     * @param metadata Meta data of item.
     */
    @JsonCreator
    public Item(@JsonProperty("name")String name, //
            @JsonProperty("price")float price, //
            @JsonProperty("discount")float discount, //
            @JsonProperty("description")String description, //
            @JsonProperty("metadata")Map<String, String> metadata) {
        super();
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.description = description;
        this.metadata = metadata;
    }

    /**
     * @return the name
     */
    public final String getName() {
        return name;
    }

    /**
     * @return the price
     */
    public final float getPrice() {
        return price;
    }

    /**
     * @return the discount
     */
    public final float getDiscount() {
        return discount;
    }

    /**
     * @return the description
     */
    public final String getDescription() {
        return description;
    }

    /**
     * @return the metadata
     */
    public final Map<String, String> getMetadata() {
        return metadata;
    }
}
