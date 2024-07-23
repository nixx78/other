package lv.nixx.poc.patterns.behavioral.ChainOfResponsibility;

public class LogManager {

    public static Logger getLogger() {
        Logger errorLogger = new ErrorLogger();
        Logger fileLogger = new FileLogger();
        Logger consoleLogger = new ConsoleLogger();

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }


}
