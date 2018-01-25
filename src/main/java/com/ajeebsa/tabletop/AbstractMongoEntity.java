
package com.ajeebsa.tabletop;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.hateoas.Identifiable;

/**
 * {@link AbstractMongoEntity} must be implemented by all entities
 * for mongodb.
 * 
 * @author Muhammad Ali Qasmi
 * @param <ID>
 * @since 1.0.0
 */
public abstract class AbstractMongoEntity<ID extends Serializable>
        implements Identifiable<ID>, Serializable {

    private static final long serialVersionUID = -1203617513489101725L;

    @Id
    private ID id;

    @Override
    public ID getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(final ID id) {
        this.id = id;
    }
}
