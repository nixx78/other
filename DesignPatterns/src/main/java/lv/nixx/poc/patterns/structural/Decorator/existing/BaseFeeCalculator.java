package lv.nixx.poc.patterns.structural.Decorator.existing;

import java.math.BigDecimal;

// Сущесвующая реализация интерфейса
public class BaseFeeCalculator implements FeeCalculator {

	@Override
	public BigDecimal calculateFee(BigDecimal amount) {
		return amount.add(BigDecimal.valueOf(1));
	}

}
