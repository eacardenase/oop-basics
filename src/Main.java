import specific.animals.Dog;
import model.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person edwin = new Person("Edwin", "Cardenas", LocalDate.of(1996, 3, 20));
        Person ana = new Person("Ana", "Torres", LocalDate.of(1998, 2, 15));
        Dog figo = new Dog("Figo", LocalDate.of(2014, 3, 20));

        edwin.setSpouse(ana);
        edwin.setPet(figo);

        figo.bark();

        System.out.println(edwin);
    }
}
