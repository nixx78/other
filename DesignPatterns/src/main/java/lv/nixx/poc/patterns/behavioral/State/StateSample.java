package lv.nixx.poc.patterns.behavioral.State;

/*
 * Состояние (англ. State) — поведенческий шаблон проектирования. Используется в тех случаях, когда во 
 * время выполнения программы объект должен менять своё поведение в зависимости от своего состояния.
 */
public class StateSample {
	
	public static void main(String[] args) {
		
		final StateContext sc = new StateContext(new StateLowerCase());

		sc.writeName("Monday");
		sc.writeName("Tuesday");
		sc.writeName("Wednesday");
		sc.writeName("Thursday");
		sc.writeName("Friday");
		sc.writeName("Saturday");
		sc.writeName("Sunday");
	}
	
	
}
