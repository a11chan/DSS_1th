package GodOfJava.chap22.d.collection;

import java.util.Stack;

public class StackSample {
  public static void main(String args[]){
    StackSample sample = new StackSample();
//    sample.checkPeek();
    sample.checkPop();
  }

  private void checkPeek() {
    Stack<Integer> intStack = new Stack<>();
    for (int loopNum = 0; loopNum < 5; loopNum++) {
      intStack.push(loopNum);
      System.out.println(intStack.peek());
    }
    System.out.println("intStack.size() = " + intStack.size());
  }

  public void checkPop() {
    Stack<Integer> intStack = new Stack<>();
    for (int loop = 0; loop < 5; loop++) {
      intStack.push(loop);
      System.out.println(intStack.pop());
    }
    System.out.println("intStack.size() = " + intStack.size());
  }
}
