package lv.nixx.poc.patterns.structural.Decorator;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

/*
 * Декоратор (англ. Decorator) — структурный шаблон проектирования, предназначенный для \
 * динамического подключения дополнительного поведения к объекту. Шаблон Декоратор предоставляет 
 * гибкую альтернативу практике создания подклассов с целью расширения функциональности.
 */
public class Decorator {
	
	@Test
	public void decoratorSample() {
		
		BigDecimal fee = new ExtraFeeCalculator(
						new AdditionalFeeCalculator(
								new BaseFeeCalculator()
						)
					).calculateFee(BigDecimal.valueOf(100));
		
		assertEquals(0, BigDecimal.valueOf(360.00).compareTo(fee));
	}

}
