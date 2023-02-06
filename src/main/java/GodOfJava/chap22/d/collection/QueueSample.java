package GodOfJava.chap22.d.collection;

import java.util.LinkedList;

public class QueueSample {
  public static void main(String[] args) {
    QueueSample sample = new QueueSample();
    sample.checkLinkedList1();
  }

  public void checkLinkedList1() {
    LinkedList<String> link = new LinkedList<>();
    link.add("A");
    link.addFirst("B");
    System.out.println("link = " + link);

    link.offerFirst("C");
    System.out.println("link = " + link);

    link.addLast("D");
    System.out.println("link = " + link);

    link.offer("E");
    System.out.println("link = " + link);

    link.offerLast("F");
    System.out.println("link = " + link);

    link.push("G");
    System.out.println("link = " + link);

    link.add(0, "H");
    System.out.println("link = " + link);
    System.out.println("Ex = " + link.set(0, "I"));

    System.out.println("link = " + link);
  }
}
