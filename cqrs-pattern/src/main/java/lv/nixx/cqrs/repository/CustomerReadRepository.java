package lv.nixx.cqrs.repository;

import lv.nixx.cqrs.model.Customer;

import java.util.*;

public class CustomerReadRepository {

    public Customer getById(long id) {
        return Optional.ofNullable(DataStorage.data().get(id)).orElseThrow(() -> new IllegalArgumentException("Customer with id [" + id + "] not exists"));
    }

}
