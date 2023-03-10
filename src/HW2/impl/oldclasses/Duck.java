package HW2.impl.oldclasses;

import HW2.inteefacesandabstracts.Animal;
import HW2.inteefacesandabstracts.Flyable;

public class Duck extends Animal implements Flyable {
   public Duck(String name) {
      super(name);
   }

   public int getFlySpeed() {
      return 0;
   }
}
