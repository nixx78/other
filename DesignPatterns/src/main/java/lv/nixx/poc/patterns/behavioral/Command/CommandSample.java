package lv.nixx.poc.patterns.behavioral.Command;

/*
 * Команда (англ. Command) — поведенческий шаблон проектирования, используемый 
 * при объектно-ориентированном программировании, представляющий действие. 
 * Объект команды заключает в себе само действие и его параметры.
 */
public class CommandSample {
	
	public static void main(String[] args) {
		
		Light light = new Light();
		Command switchUp = new TurnOnLightCommand(light);
		Command switchDown = new TurnOffLightCommand(light);

		Switch s = new Switch(switchUp, switchDown);

		s.flipUp();
		s.flipDown();
	}
	
}
