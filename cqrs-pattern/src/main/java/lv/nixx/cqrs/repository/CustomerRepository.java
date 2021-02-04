package lv.nixx.cqrs.repository;

import lv.nixx.cqrs.model.Customer;

import java.util.*;

public class CustomerRepository {

    // TODO https://www.baeldung.com/cqrs-event-sourcing-java

    private Map<Long, Customer> repo = new TreeMap<>();

    public Customer save(Customer customer) {

        long key = 1L;
        if (!repo.isEmpty()) {
            key = Collections.max(repo.entrySet(), Comparator.comparingLong(Map.Entry::getKey)).getKey() + 1;
        }

        return  repo.computeIfAbsent(key, customer::setId);
    }

}
