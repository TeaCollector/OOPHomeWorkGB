package HW2.impl.newclasses;

import HW2.inteefacesandabstracts.Animal;
import HW2.inteefacesandabstracts.Flyable;
import HW2.inteefacesandabstracts.Swimable;

public class FlyingFish extends Animal implements Flyable, Swimable {
   public FlyingFish(String name) {
      super(name);
   }

   public int getFlySpeed() {
      return 15;
   }

   public double getSwimSpeed() {
      return 8.0D;
   }
}
