package lv.nixx.poc.patterns.creational;

import lv.nixx.poc.patterns.creational.Builder.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BuilderTest {

    @Test
    void buildTransaction() {

        Transaction txn = Transaction.builder()
                .withId("100")
                .withAccount("AccountId")
                .withAmount(BigDecimal.valueOf(10.20))
                .withCurrency("USD")
                .build();

        assertAll(
                () -> assertNotNull(txn),
                () -> Assertions.assertEquals("100", txn.getId()),
                () -> Assertions.assertEquals("AccountId", txn.getAccount()),
                () -> Assertions.assertEquals(BigDecimal.valueOf(10.20), txn.getAmount()),
                () -> Assertions.assertEquals("USD", txn.getCurrency())
        );

    }
}
