package lv.nixx.poc.patterns.behavioral.ChainOfResponsibility;

public abstract class Logger {

    private Level level;
    protected Logger nextLogger;

    public Logger(Level level) {
        this.level = level;
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(Level level, String message) {
        if (this.level.getIntValue() <= level.getIntValue()) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
