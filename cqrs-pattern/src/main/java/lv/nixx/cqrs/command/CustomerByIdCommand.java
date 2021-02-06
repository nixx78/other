package lv.nixx.cqrs.command;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CustomerByIdCommand {
    private long id;
}
