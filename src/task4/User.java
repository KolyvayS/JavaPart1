package task4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
class User {
    private long id;
    private String firstName;
    private String lastName;
}
