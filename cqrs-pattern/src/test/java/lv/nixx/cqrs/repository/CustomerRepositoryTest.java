package lv.nixx.cqrs.repository;

import lv.nixx.cqrs.model.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerRepositoryTest {

    @Test
    public void saveCustomerTest() {
        CustomerRepository r = new CustomerRepository();

        assertEquals(1, r.save(new Customer()
                .setName("Name.1")
        ).getId());

        assertEquals(2, r.save(new Customer()
                .setName("Name.2")
        ).getId());


    }
}
