/**
 *
 */
package com.springbootdemo.service;

import java.util.List;

/**
 * @author RamS
 * @param <T>
 *
 */
public interface IRawService<T> {

    T findById(final Long id);

    List<T> findByName(final String name);

    List<T> findAll();

    void delete(final Long id);

    void deleteAll();

    T save(final T resource);

    T update(final Long id, final T resource);
}
