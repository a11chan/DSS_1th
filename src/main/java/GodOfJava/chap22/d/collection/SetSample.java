package GodOfJava.chap22.d.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {
  public static void main(String[] args) {
    SetSample sample = new SetSample();
    String[] cars = new String[]{
        "Tico", "Sonata", "BMW", "Benz",
        "Lexus", "Mustang", "Grandeure",
        "The Bettle", "Mini Copper", "i30",
        "BMW", "Lexus", "Carnibal", "SM5",
        "SM7", "SM3", "Tico"
    };
    System.out.println("cars.length = " + cars.length);
    System.out.println(sample.getCarKinds(cars));
  }
  public int getCarKinds(String[] cars) {
//내가 구현
//    HashSet<String> carNameSet = new HashSet<>();
//    for(String car : cars) {
//      carNameSet.add(car);
//    }
//    return carNameSet.size();

// 저자님 구현
    if (cars == null) return 0;
    if (cars.length == 1) return 1;
    Set<String> carSet = new HashSet<>();
    for(String car : cars) {
      carSet.add(car);
    }
    printCarSet(carSet);
    printCarSet2(carSet);
    return carSet.size();
  }

  public void printCarSet(Set<String> carSet) {
    for (String temp : carSet) {
      System.out.print(temp + " ");
    }
    System.out.println();
  }

  public void printCarSet2(Set<String> carSet) {
    Iterator<String> iterator = carSet.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
    System.out.println();
  }
}
