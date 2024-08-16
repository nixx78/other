package lv.nixx.poc.patterns.structural.Decorator.existing;

import java.math.BigDecimal;

// Базовый интерфейс, которые реализует уже сущесвующий класс
public interface FeeCalculator {

	BigDecimal calculateFee(BigDecimal amount);
	
}
