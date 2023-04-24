package model;

public class Turtle extends Pet {
    public void hide() {
        // accessible because of inheritance and package protection level
        super.packageProtected();
    }
}
