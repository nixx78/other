package lv.nixx.cqrs.command;

import lv.nixx.cqrs.model.Account;

import java.util.Collection;

public class CustomerUpdateCommand {
    private long id;
    private String name;
    private Collection<Account> accounts;
}
