package com.biantech.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.AfterStep;
import org.springframework.batch.core.annotation.BeforeStep;

public class AopLogHandler {
    private Logger logger = LoggerFactory.getLogger(AopLogHandler.class);

    @BeforeStep
    public void beforeStep(StepExecution stepExecution) {
        logger.info("beforeStep #1");
    }

    @AfterStep
    public ExitStatus afterStep(StepExecution stepExecution) {
        logger.info("afterStep #1");
        return stepExecution.getExitStatus();
    }
}
