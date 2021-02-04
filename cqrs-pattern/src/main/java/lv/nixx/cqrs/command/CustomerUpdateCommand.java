package lv.nixx.cqrs.command;

import lombok.Data;
import lombok.Getter;
import lombok.experimental.Accessors;
import lv.nixx.cqrs.model.Account;

import java.util.Collection;

@Data
@Accessors(chain = true)
public class CustomerUpdateCommand {
    private long id;
    private String name;
    private Collection<Account> accounts;
}
