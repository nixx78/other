package lv.nixx.poc.patterns.behavioral.Command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TurnOnLightCommand implements Command {
    private final Light theLight;

    public void execute() {
        theLight.turnOn();
    }
}