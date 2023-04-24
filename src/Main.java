import specific.animals.Dog;
import model.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person edwin = new Person("Edwin", "Cardenas", LocalDate.of(1996, 3, 20));
//        Person ana = new Person(); // throws error because of private access level on Person constructor

        System.out.println(edwin);
    }
}
