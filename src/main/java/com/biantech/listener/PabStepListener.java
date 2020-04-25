package com.biantech.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class PabStepListener implements StepExecutionListener {

    private Logger logger = LoggerFactory.getLogger(PabStepListener.class);

    @Override
    public void beforeStep(StepExecution stepExecution) {
        logger.info("beforeStep #2");
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        logger.info("afterStep #2");
        return stepExecution.getExitStatus();
    }
}
