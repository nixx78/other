package lv.nixx.poc.patterns.behavioral.ChainOfResponsibility;

public class ErrorLogger extends Logger {

    public ErrorLogger() {
        super(Level.ERROR);
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}

