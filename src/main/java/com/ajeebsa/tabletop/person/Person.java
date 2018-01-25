
package com.ajeebsa.tabletop.person;

import static com.ajeebsa.tabletop.person.Person.*;

import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ajeebsa.tabletop.AbstractMongoEntity;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Person} implements POJO to store person details.
 * 
 * @author Muhammad Ali Qasmi
 * @since 1.0.0
 */
@Document(collection = COLLECTION_NAME)
public class Person extends AbstractMongoEntity<ObjectId> {

    private static final long serialVersionUID = -409819619735952230L;

    public static final String COLLECTION_NAME = "persons";
    
    @NotNull(message = "name is requied.")
    private final String name;

    private final String contact;
    
    private final String email;

    /**
     * Creates {@link Person} object
     * 
     * @param name Name of person
     * @param contact Contact number of person
     * @param email Email of person
     */
    @JsonCreator
    public Person(@JsonProperty("name") String name, //
            @JsonProperty("contact") String contact, //
            @JsonProperty("email") String email) {
        super();
        this.name = name;
        this.contact = contact;
        this.email = email;
    }

    /**
     * @return the name
     */
    public final String getName() {
        return name;
    }

    /**
     * @return the contact
     */
    public final String getContact() {
        return contact;
    }

    /**
     * @return the email
     */
    public final String getEmail() {
        return email;
    }
}
