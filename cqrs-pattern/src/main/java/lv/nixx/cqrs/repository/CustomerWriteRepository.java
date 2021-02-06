package lv.nixx.cqrs.repository;

import lv.nixx.cqrs.model.Account;
import lv.nixx.cqrs.model.Customer;

import java.util.*;

public class CustomerWriteRepository {

    // TODO https://www.baeldung.com/cqrs-event-sourcing-java

    void removeAll() {
        DataStorage.data().clear();
    }

    public Customer save(Customer customer) {
        final Map<Long, Customer> repo = DataStorage.data();

        long key = 1L;
        if (!repo.isEmpty()) {
            key = Collections.max(repo.entrySet(), Comparator.comparingLong(Map.Entry::getKey)).getKey() + 1;
        }

        return  repo.computeIfAbsent(key, customer::setId);
    }

    public Customer update(long id, String name, Collection<Account> account) {
        return DataStorage.data().computeIfPresent(id, (k, v) -> {
            v.setName(name);
            v.setAccounts(account);
            return v;
        });
    }

}
