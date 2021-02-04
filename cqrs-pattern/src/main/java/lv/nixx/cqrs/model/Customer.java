package lv.nixx.cqrs.model;


import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

@Data
@Accessors(chain = true)
public class Customer {
    private long id;
    private String name;
    private LocalDate dateOfBirth;
    private Collection<Account> accounts;
}
