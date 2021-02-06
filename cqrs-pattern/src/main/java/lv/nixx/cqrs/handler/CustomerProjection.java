package lv.nixx.cqrs.handler;

import lv.nixx.cqrs.command.CustomerByIdCommand;
import lv.nixx.cqrs.model.Customer;
import lv.nixx.cqrs.repository.CustomerReadRepository;

public class CustomerProjection {

    private CustomerReadRepository repo = new CustomerReadRepository();

    public Customer handle(CustomerByIdCommand c) {
        return repo.getById(c.getId());
    }

}
