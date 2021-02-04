package lv.nixx.cqrs.model;


import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Collection;
import java.util.Date;

@Data
@Accessors(chain = true)
public class Customer {
    private long id;
    private String name;
    private Date dateOfBirth;
    private Collection<Account> accounts;
}
