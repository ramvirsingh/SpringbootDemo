/**
 *
 */
package com.springbootdemo.common;

/**
 * @author RAM
 *
 */
public interface ByNameApiIFace<T extends WithNameIFace> {

    T findOneByName(final String name);
}
