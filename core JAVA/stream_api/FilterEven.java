package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEven {

  public static void main(String[] args) {
    //way 1 to create List
    List<Integer> list1 = List.of(2, 11, 24, 17, 52, 71, 98); //immutable list is returned from this method

    //way 2 create list
    List<Integer> list2 = new ArrayList<>(); //mutable
    list2.add(12);
    list2.add(51);
    list2.add(17);
    list2.add(24);

    //way 3 to create list
    List<Integer> list3 = Arrays.asList(12, 43, 56, 21, 54); //immutable list

    //processng without stream api - gettng a list having even numbers only
    List<Integer> evenList = new ArrayList<>();
    for (Integer val : list1) {
      if (val % 2 == 0) evenList.add(val);
    }

    System.out.println("List1 - " + list1);
    System.out.println("List of even numbers(without stream) - " + evenList);

    //processing using stram api - getting even number list
    Stream<Integer> stream = list1.stream();
    List<Integer> newList = stream
      .filter(i -> i % 2 == 0)
      .collect(Collectors.toList());
    System.out.println("List of even numbers(using stream) - " + newList);

    //using stream api directly - getting even numbers
    newList =
      list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    System.out.println("List of even numbers(using stream) - " + newList);

    //processing using stream API - list of numbers greater than 5
    System.out.println(
      "List of numbers greater than 50(using stream) - " +
      list1.stream().filter(i -> i > 50).collect(Collectors.toList())
    );
  }
}
