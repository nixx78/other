package lv.nixx.cqrs.command;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class CustomerCreateCommand {
    private String name;
    private Date dateOfBirth;
}
