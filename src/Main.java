import specific.animals.Dog;
import model.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person edwin = new Person("edwin", "cardenas", LocalDate.of(1996, 3, 20));
//        Person ana = new Person(); // throws error because of private access level on Person constructor

        System.out.format("The person's first name is: %s.", edwin.getFirstname());
    }
}
