package HW1.child;

import HW1.parent.Animal;

public class Kangaroo extends Animal {
    public Kangaroo(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void goToSleep() {
        super.goToSleep();
    }

    @Override
    public void toFly() {
        System.out.println("I can't flying!!!");
        toGo();
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
