package lv.nixx.poc.patterns.behavioral.Strategy;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class Order {

    private final BigDecimal totalAmount;
    private final PaymentStrategy paymentStrategy;

    public BigDecimal pay() {
        return paymentStrategy.pay(this.totalAmount);
    }
}
