package ModernJavaInAction.chap08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Map.entry;

public class MyWorkingWithCollections {

  public static void main(String[] args) {
    mergingMaps();
    mergingMaps1();
    mergingMaps2();
    mergingMaps3();
    mergingMaps4();
  }

  private static void mergingMaps() {
    System.out.println("p288 예제");
    Map<String, String> family = Map.ofEntries(
        entry("Teo", "Star Wars"),
        entry("Cristina", "James Bond"));
    Map<String, String> friends = Map.ofEntries(entry("Raphael", "Star Wars"));

    System.out.println("--> Merging the old way");
    Map<String, String> everyone = new HashMap<>(family);
    everyone.putAll(friends);
    System.out.println(everyone);

    Map<String, String> friends2 = Map.ofEntries(
        entry("Raphael", "Star Wars"),
        entry("Cristina", "Matrix"));

    System.out.println("--> Merging maps using merge()");
    Map<String, String> everyone2 = new HashMap<>(family);
    friends2.forEach((k, v) -> everyone2.merge(k, v, (movie1, movie2) -> movie1 + " & " + movie2));
    System.out.println(everyone2);
    System.out.println();
  }
  private static void mergingMaps1() {
    System.out.println("p288 예제");
    Map<String, String> everyone = Map.ofEntries(
        entry("Teo", "Star Wars"),
        entry("Cristina", "James Bond_Old"));

    Map<String, String> friends = Map.ofEntries(
        entry("Raphael", "Star Wars"),
        entry("Cristina", "Matrix_New"));

    System.out.println("--> Merging maps using merge() - renameParam");
    Map<String, String> everyone2 = new HashMap<>(everyone);
    friends.forEach((k, v) -> everyone2.merge(k, v, (oldValue, newValue) -> oldValue + " & " + newValue));
    System.out.println(everyone2);
    System.out.println();
  }

  private static void mergingMaps2() {
    System.out.println("p289 예제");
    System.out.println("--> Merging maps using merge()");
    Map<String, Long> moviesToCount = new HashMap<>();
    String movieName = "JamesBond";
    moviesToCount.merge(movieName, 1L, (key, count) -> count + 1L);
    moviesToCount.merge(movieName, 1L, (key, count) -> count + 1L);
    System.out.println("moviesToCount = " + moviesToCount);
    System.out.println();
  }

  private static void mergingMaps3() {
    System.out.println("p289 예제");
    System.out.println("--> Merging maps using merge() - custom");
    Map<String, Long> moviesToCount = new HashMap<>();
    String movieName = "JamesBond";
    moviesToCount.merge(movieName, 1L, (oldValue, newValue) -> newValue + 1L);
    moviesToCount.merge(movieName, 1L, (oldValue, newValue) -> newValue + 1L);
    System.out.println("moviesToCount = " + moviesToCount);
    System.out.println();
  }

  private static void mergingMaps4() {
    System.out.println("퀴즈8-2_p289");
    HashMap<String, Integer> movies = new HashMap<>();
    movies.put("JamesBond", 20);
    movies.put("Matrix", 15);
    movies.put("Harry Potter", 5);
    Set<Map.Entry<String, Integer>> entries = movies.entrySet().stream()
        .filter(entry -> entry.getValue() > 10)
//        .forEach(System.out::println);
        .collect(Collectors.toSet());
    System.out.println("entries = " + entries);
  }

}
