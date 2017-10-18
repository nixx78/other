package lv.nixx.poc.patterns.creational.Builder;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

/*
 * Строитель (англ. Builder) — порождающий шаблон проектирования предоставляет способ создания составного объекта.
 */
public class Builder {
	
	@Test
	public void buildTransaction() {
		
		Transaction txn = Transaction.builder()
				.withId("100")
				.withAccount("AccountId")
				.withAmount(BigDecimal.valueOf(10.20))
				.withCurrency("USD")
				.build();

		assertNotNull(txn);
		assertEquals("100", txn.getId());
		assertEquals("AccountId", txn.getAccount());
		assertEquals(BigDecimal.valueOf(10.20), txn.getAmount());
		assertEquals("USD", txn.getCurrency());
	}

}
