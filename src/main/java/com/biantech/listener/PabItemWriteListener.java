package com.biantech.listener;

import com.biantech.model.Access;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemWriteListener;

import java.util.List;

public class PabItemWriteListener implements ItemWriteListener<Access> {
    private Logger logger = LoggerFactory.getLogger(PabItemWriteListener.class);
    @Override
    public void beforeWrite(List<? extends Access> items) {

    }

    @Override
    public void afterWrite(List<? extends Access> items) {

    }

    @Override
    public void onWriteError(Exception exception, List<? extends Access> items) {

    }

}
