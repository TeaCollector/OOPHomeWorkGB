package HW2.impl.newclasses;

import HW2.inteefacesandabstracts.Animal;
import HW2.inteefacesandabstracts.Flyable;
import HW2.inteefacesandabstracts.Swimable;

public class Swam extends Animal implements Flyable, Swimable {
   public Swam(String name) {
      super(name);
   }

   public int getFlySpeed() {
      return 15;
   }

   public double getSwimSpeed() {
      return 3.6D;
   }
}
