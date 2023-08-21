package lv.nixx.poc.patterns.behavioral.Strategy;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/*
 * Стратегия (англ. Strategy) — поведенческий шаблон проектирования, предназначенный
 * для определения семейства алгоритмов, инкапсуляции каждого из них и обеспечения их взаимозаменяемости.
 * Это позволяет выбирать алгоритм путём определения соответствующего класса.
 * Шаблон Strategy позволяет менять выбранный алгоритм независимо от объектов-клиентов, которые его используют.
 */
class StrategySample {

    @Test
    void paymentsWithDifferentStrategiesTest() {
        new Order(BigDecimal.valueOf(12.12), new CardPayment()).pay();
        new Order(BigDecimal.valueOf(12.12), new DirectPayment()).pay();
        new Order(BigDecimal.valueOf(12.12), new DelayedPayment()).pay();
    }


}
