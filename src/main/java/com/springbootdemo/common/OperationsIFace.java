/**
 *
 */
package com.springbootdemo.common;

import java.io.Serializable;
import java.util.List;

/**
 * @author RAM
 *
 */
public interface OperationsIFace<T extends Serializable> {

    T findOne(final long id);

    /**
     * - contract: if nothing is found, an empty list will be returned to the calling client <br>
     */
    List<T> findAll();
    // create

    T create(final T resource);

    // update

    void update(final T resource);

    // delete

    void delete(final long id);

    void deleteAll();

    // count

    long count();
}
