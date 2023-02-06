package GodOfJava.chap22.d.collection;

import java.util.ArrayList;

public class ListSample {
  public static void main(String[] args) {
    ListSample sample = new ListSample();
//    sample.checkArrayList1();
//    sample.checkArrayList2();
//    sample.checkArrayList5();
//    sample.checkArrayList6();
    sample.checkArrayList7();
//    sample.checkArrayList8();
//    sample.checkArrayList9();
  }
  public void checkArrayList1() {
    ArrayList<String> list = new ArrayList<>();
    //list1.add(new Object());
    list.add("arrayListSample");
    //list1.add(new Double(1));
    System.out.println("list = " + list);
  }

  public void checkArrayList2() {
    ArrayList<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");
    list.add(1,"A1");
//    list.add(10,"A1");
//    Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 10, Size: 5
//    System.out.println("list = " + list);
    for (String tempData : list) {
      System.out.println("tempData = " + tempData);
    }
  }

  public void checkArrayList3() {
    ArrayList<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");
    list.add(1,"A1");
    ArrayList<String> list2 = new ArrayList<>();
    list2.add("0 ");
    list2.addAll(list);
    for(String tempData:list2) {
      System.out.println("List2 "+tempData);
    }
  }

  public void checkArrayList5() {
    ArrayList<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    int listSize = list.size();
    for(int loop = 0;loop<listSize;loop++){
      System.out.println("list.get("+loop+") = " + list.get(loop));
    }
  }

  public void checkArrayList6() {
    ArrayList<String> list = new ArrayList<>();
    list.add("A");
    String[] strList = list.toArray(new String[0]);
    System.out.println(strList[0]);
  }

  public void checkArrayList7() {
    ArrayList<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    String[] tempArray = new String[2];
    // 책 내용에 따르면 null, null 로 나와야 하는데 "A", "B", "C" 정상출력
    // 자바의 정석과 비교 필
    String[] strList = list.toArray(tempArray);
    for(String temp:strList) {
      System.out.println(temp);
    }
  }

  public void checkArrayList8() {
    ArrayList<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("A");
//    System.out.println("list.remove(0) = " + list.remove(0));
//    System.out.println(list.remove("A"));
    ArrayList<String> temp = new ArrayList<>();
    temp.add("A");
    list.removeAll(temp);
    for (int loopNum = 0; loopNum < list.size(); loopNum++) {
      System.out.println("list.get("+loopNum+") = " + list.get(loopNum));
    }
  }

  public void checkArrayList9() {
    ArrayList<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("A");
    String result = list.set(3,"D");
    System.out.println("result = " + result);
    for (int loopNum = 0; loopNum < list.size(); loopNum++) {
      System.out.println("list.get("+loopNum+") = " + list.get(loopNum));
    }
  }
}
