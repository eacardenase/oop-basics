package specific.animals;

import model.Pet;

public class Cat extends Pet {
    public void meow() {
        System.out.println("Meow meow");
        super.protectedMethod();
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);
    }

    @Override
    public String toString() {
        return "Cat - name: tony";
    }
}
