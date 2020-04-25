package com.biantech.listener;

import com.biantech.model.Access;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemProcessListener;

public class PabItemProcessListener implements ItemProcessListener<Access, Access> {
    private Logger logger = LoggerFactory.getLogger(PabItemProcessListener.class);
    @Override
    public void beforeProcess(Access item) {

    }

    @Override
    public void afterProcess(Access item, Access result) {

    }

    @Override
    public void onProcessError(Access item, Exception e) {

    }
}
