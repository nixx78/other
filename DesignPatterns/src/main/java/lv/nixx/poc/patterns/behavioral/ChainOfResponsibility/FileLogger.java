package lv.nixx.poc.patterns.behavioral.ChainOfResponsibility;

public class FileLogger extends Logger {

    public FileLogger() {
        super(Level.DEBUG);
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}

