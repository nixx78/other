package lv.nixx.poc.patterns.behavioral.Command;

public class TurnOffLightCommand implements Command {
	private Light theLight;

	public TurnOffLightCommand(Light light) {
		this.theLight = light;
	}

	public void execute() {
		theLight.turnOff();
	}
}