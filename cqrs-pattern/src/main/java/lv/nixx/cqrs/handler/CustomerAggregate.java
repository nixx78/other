package lv.nixx.cqrs.handler;

import lv.nixx.cqrs.command.CustomerCreateCommand;
import lv.nixx.cqrs.command.CustomerUpdateCommand;
import lv.nixx.cqrs.model.Customer;
import lv.nixx.cqrs.repository.CustomerWriteRepository;

public class CustomerAggregate {

    private CustomerWriteRepository repository = new CustomerWriteRepository();

    public Customer createHandler(CustomerCreateCommand command) {
        return repository.save(
                new Customer()
                        .setName(command.getName())
                        .setDateOfBirth(command.getDateOfBirth())
        );
    }

    public Customer updateHandler(CustomerUpdateCommand command) {
        return repository.update(command.getId(), command.getName(), command.getAccounts());
    }

}
