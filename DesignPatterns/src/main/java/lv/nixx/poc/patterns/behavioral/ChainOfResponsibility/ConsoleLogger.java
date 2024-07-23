package lv.nixx.poc.patterns.behavioral.ChainOfResponsibility;

public class ConsoleLogger extends Logger {

    public ConsoleLogger() {
        super(Level.INFO);
    }

    @Override
    protected void write(String message) {
        System.out.println("ConsoleLogger: " + message);
    }
}
