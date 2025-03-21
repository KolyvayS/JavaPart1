package task4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
class Account {
    private long id;
    private long balance;
    private User owner;
}