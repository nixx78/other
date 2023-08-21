package lv.nixx.poc.patterns.behavioral.Strategy;

import java.math.BigDecimal;

public interface PaymentStrategy {
    BigDecimal pay(BigDecimal amount);
}
