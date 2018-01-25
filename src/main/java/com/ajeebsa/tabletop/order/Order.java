
package com.ajeebsa.tabletop.order;

import static com.ajeebsa.tabletop.order.Order.*;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ajeebsa.tabletop.AbstractMongoEntity;
import com.ajeebsa.tabletop.location.Location;
import com.ajeebsa.tabletop.person.Person;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Order} implements POJO for items' order.
 * 
 * @author Muhammad Ali Qasmi
 * @since 1.0.0
 */
@Document(collection = COLLECTION_NAME)
public class Order extends AbstractMongoEntity<ObjectId> {
    
    private static final long serialVersionUID = 7735530291673328651L;

    public static final String COLLECTION_NAME = "orders";

    @Valid
    @NotNull(message ="person is required.")
    private final Person person;

    @Valid
    @NotNull(message = "itemRequests is required.")
    private final List<ItemRequest> itemRequests;

    @Valid
    @NotNull(message = "location is required.")
    private final Location location;
    
    private final Date dataTime;

    /**
     * Creates {@link Order} object
     * 
     * @param person Person who placed order
     * @param itemRequests Requests of items in order
     * @param location Serve location of order
     * @param dataTime Time when order requested
     */
    @JsonCreator
    public Order(@JsonProperty("person") Person person, //
            @JsonProperty("itemRequests") List<ItemRequest> itemRequests, //
            @JsonProperty("location") Location location, // '
            @JsonProperty("dateTime") Date dataTime) {
        super();
        this.person = person;
        this.itemRequests = itemRequests;
        this.location = location;
        this.dataTime = dataTime;
    }

    /**
     * @return the person
     */
    public final Person getPerson() {
        return person;
    }

    /**
     * @return the itemRequests
     */
    public final List<ItemRequest> getItemRequests() {
        return itemRequests;
    }

    /**
     * @return the location
     */
    public final Location getLocation() {
        return location;
    }

    /**
     * @return the dataTime
     */
    public final Date getDataTime() {
        return dataTime;
    }
}
