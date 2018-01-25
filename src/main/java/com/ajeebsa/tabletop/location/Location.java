package com.ajeebsa.tabletop.location;

import static com.ajeebsa.tabletop.location.Location.*;

import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ajeebsa.tabletop.AbstractMongoEntity;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Location} implements POJO for request location.
 * 
 * @author Muhammad Ali Qasmi
 * @since 1.0.0
 */
@Document(collection = COLLECTION_NAME)
public class Location extends AbstractMongoEntity<ObjectId> {
    
    private static final long serialVersionUID = 6615472554425678895L;

    public static final String COLLECTION_NAME = "locations";
    
    @NotNull(message = "tableNumber is required.")
    private final int tableNumber;
    
    private final int floorNumber;
    
    /**
     * Creates {@link Location} object.
     * 
     * @param tableNumber Id of table
     * @param floorNumber Floor number
     */
    @JsonCreator
    public Location(@JsonProperty("tableNumber")int tableNumber, //
            @JsonProperty("floorNumber")int floorNumber) {
        super();
        this.tableNumber = tableNumber;
        this.floorNumber = floorNumber;
    }
    
    /**
     * @return the tableNumber
     */
    public final int getTableNumber() {
        return tableNumber;
    }
    
    /**
     * @return the floorNumber
     */
    public final int getFloorNumber() {
        return floorNumber;
    }
    
}
