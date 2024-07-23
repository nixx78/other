package lv.nixx.poc.patterns.behavioral.ChainOfResponsibility;

import org.junit.jupiter.api.Test;

public class LoggerDemo {

    Logger log = LogManager.getLogger();

    @Test
    void logDebugMessage() {
        log.logMessage(Level.DEBUG, "Debug message");
    }

    @Test
    void logInfoMessage() {
        log.logMessage(Level.INFO, "Info message");
    }

    @Test
    void logErrorMessage() {
        log.logMessage(Level.ERROR, "Error message");
    }

}
