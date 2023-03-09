package seminar2.veterinary;

import seminar.Animal;
import seminar2.Flyable;
import seminar2.Illable;

public class Eagle extends Animal implements Illable, Flyable {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void foo() {

    }

    @Override
    public void findFood() {

    }

    @Override
    public void play() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void speak() {

    }

    @Override
    public int getFlySpeed() {
        return 120 ;
    }

    @Override
    public void getIll() {
    }
}