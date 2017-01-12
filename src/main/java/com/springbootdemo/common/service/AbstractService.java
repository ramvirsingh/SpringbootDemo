package com.springbootdemo.common.service;

import com.springbootdemo.model.NameableEntityIFace;

public abstract class AbstractService<T extends NameableEntityIFace> extends AbstractRawService<T> implements ServiceIFace<T> {

    public AbstractService() {
        super();
    }

    // API

}
