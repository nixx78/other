package lv.nixx.cqrs.handler;

import lv.nixx.cqrs.command.CustomerByIdCommand;
import lv.nixx.cqrs.model.Customer;
import lv.nixx.cqrs.repository.DataStorage;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CustomerProjectionTest {

    private CustomerProjection customerProjection = new CustomerProjection();

    @Test
    void customerByIdTest() {

        long id = 1L;

        DataStorage.data().put(id, new Customer()
                .setId(id)
                .setName("Name1")
        );

        final Customer customer = customerProjection.handle(new CustomerByIdCommand(id));

        assertAll(
                () -> assertNotNull(customer),
                () -> assertEquals(id, customer.getId()),
                () -> assertEquals("Name1", customer.getName())
        );

    }

}
