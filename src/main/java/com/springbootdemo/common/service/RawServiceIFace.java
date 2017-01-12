/**
 *
 */
package com.springbootdemo.common.service;

import com.springbootdemo.common.OperationsIFace;
import com.springbootdemo.model.EntityIFace;

/**
 * @author RAM
 *
 */
public interface RawServiceIFace<T extends EntityIFace> extends OperationsIFace<T> {

}
