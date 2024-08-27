package lv.nixx.poc.patterns.structural.Adapter;

import java.math.BigDecimal;

/*
 * Адаптер (англ. Adapter) — структурный шаблон проектирования, предназначенный для организации использования
 * функций объекта, недоступного для модификации, через специально созданный интерфейс.
 * */
public class Adapter {

    public static void main(String[] args) {
        ExistingCoreSystem core = new ExistingCoreSystem();
        ExpectedInterface adapter = new ExistingCoreSystemAdapter(core);
        adapter.createTransaction("USD", "ACCOUNT1", BigDecimal.valueOf(12.78));
    }

}
