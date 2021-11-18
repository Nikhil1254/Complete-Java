package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

  public static void main(String[] args) {
    //ways to get Stream objects
    //   1. getting empty stream object
    Stream<Integer> stream1 = Stream.empty();
    stream1.forEach(
      val -> {
        System.out.println(val);
      }
    );

    //2. collection,arrays to stream
    List<Integer> list1 = new ArrayList<>();
    list1.add(12);
    list1.add(52);
    list1.add(57);
    String[] arr = { "Nikhil", "Rakesh", "Ram", "Ramesh" };
    Stream<String> stream2 = Stream.of(arr);
    Stream<List<Integer>> stream3 = Stream.of(list1); //it has returned stream of Lists
    stream2.forEach(
      val -> {
        System.out.println(val);
      }
    );

    stream3.forEach(
      val -> {
        val.forEach(
          ele -> {
            System.out.println(ele);
          }
        );
      }
    );

    //3.using builder
    Stream.Builder<String> stream4 = Stream.builder();
    stream4.add("Nikhil");
    stream4.add("Rakesh");
    Stream<String> stream5 = stream4.build(); //it will return Stream object - build method
    stream5.forEach(
      ele -> {
        System.out.println(ele);
      }
    );

    //4.using Arrays
    Stream<String> stream6 = Arrays.stream(
      new String[] { "Ram", "Raj", "nikhil" }
    ); //returbn
    stream6.forEach(
      ele -> {
        System.out.println(ele);
      }
    );

    //5. using collection objects mostly used way
    Stream<Integer> stream7 = list1.stream();
    stream7.forEach(
      ele -> {
        System.out.println(ele);
      }
    );
  }
}
