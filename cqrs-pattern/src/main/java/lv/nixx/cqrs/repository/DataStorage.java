package lv.nixx.cqrs.repository;

import lv.nixx.cqrs.model.Customer;

import java.util.Map;
import java.util.TreeMap;

public class DataStorage {

    private static Map<Long, Customer> repo = new TreeMap<>();

    public static Map<Long, Customer> data() {
        return repo;
    }

}
