package lv.nixx.poc.patterns.behavioral.Observer;

/*
 * Наблюдатель (англ. Observer) — поведенческий шаблон проектирования. Также известен как «подчинённые» (Dependents). 
 * Создает механизм у класса, который позволяет получать экземпляру объекта этого класса оповещения от других 
 * объектов об изменении их состояния, тем самым наблюдая за ними.
 */
public class ObserverSample {
	
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();

		new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(29f, 65f, 745);
		weatherData.setMeasurements(39f, 70f, 760);
		weatherData.setMeasurements(42f, 72f, 763);
	}
	
}
