package lv.nixx.cqrs.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Accessors(chain = true)
public class Transaction {
    private long id;
    private BigDecimal amount;
    private String accountNumber;
    private Date date;
}
