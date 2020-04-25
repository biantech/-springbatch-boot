package com.biantech.listener;

import com.biantech.model.Access;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemReadListener;

public class PabItemReadListener implements ItemReadListener<Access> {
    private Logger logger = LoggerFactory.getLogger(PabItemReadListener.class);
    @Override
    public void beforeRead() {

    }

    @Override
    public void afterRead(Access item) {

    }

    @Override
    public void onReadError(Exception ex) {

    }
}
