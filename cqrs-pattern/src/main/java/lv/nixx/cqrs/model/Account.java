package lv.nixx.cqrs.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Collection;

@Data
@Accessors(chain = true)
public class Account {
    private long id;
    private String number;
    private String name;
    private Collection<Transaction> txns;
}
