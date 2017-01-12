/**
 *
 */
package com.springbootdemo.common.service;

import com.springbootdemo.common.ByNameApiIFace;
import com.springbootdemo.model.NameableEntityIFace;

/**
 * @author RAM
 *
 */
public interface ServiceIFace<T extends NameableEntityIFace> extends RawServiceIFace<T>, ByNameApiIFace<T> {

}
