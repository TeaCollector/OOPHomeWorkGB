package HW2.impl.oldclasses;

import HW2.inteefacesandabstracts.Animal;
import HW2.inteefacesandabstracts.Flyable;
import HW2.inteefacesandabstracts.Illable;

public class Eagle extends Animal implements Illable, Flyable {
   public Eagle(String name) {
      super(name);
   }

   public int getFlySpeed() {
      return 120;
   }

   public void getIll() {
   }
}
