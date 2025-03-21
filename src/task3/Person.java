package task3;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString(includeFieldNames = true)
class Person {
    String name;
    int age;
}