package lv.nixx.poc.patterns.behavioral.Command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Switch {

    private final Command flipUpCommand;
    private final Command flipDownCommand;

    public void flipUp() {
        flipUpCommand.execute();
    }

    public void flipDown() {
        flipDownCommand.execute();
    }

}