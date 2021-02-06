package lv.nixx.cqrs.repository;

import lv.nixx.cqrs.model.Account;
import lv.nixx.cqrs.model.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

class CustomerWriteRepositoryTest {

    private CustomerWriteRepository repo = new CustomerWriteRepository();

    @BeforeEach
    void init() {
        repo.removeAll();
    }

    @Test
    void saveCustomerTest() {

        assertEquals(1, repo.save(new Customer()
                .setName("Name.1")
        ).getId());

        assertEquals(2, repo.save(new Customer()
                .setName("Name.2")
        ).getId());
    }

    @Test
    void updateCustomer() {

        final long id = repo.save(new Customer()
                .setName("Name.1")
                .setDateOfBirth(LocalDate.of(1978, 12, 6))
        ).getId();

        assertEquals(1, id);

        final Customer updated = repo.update(id, "New.Name.1",
                List.of(new Account()
                        .setName("Saving")
                        .setNumber("0001-100000-001")
                )
        );

        final Account acc = updated.getAccounts().iterator().next();

        assertAll(
                () -> assertEquals("New.Name.1", updated.getName()),
                () -> assertEquals("Saving", acc.getName()),
                () -> assertEquals("0001-100000-001", acc.getNumber())
        );


    }
}
