package lv.nixx.poc.patterns.behavioral.ChainOfResponsibility;

import lombok.Getter;

@Getter
public enum Level {
    INFO(1), DEBUG(2), ERROR(3);

    private final int intValue;

    Level(int intValue) {
        this.intValue = intValue;
    }
}
