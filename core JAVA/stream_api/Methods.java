package stream_api;

import java.util.stream.Stream;
import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Methods {

  public static void main(String[] args) {
    //filter() - filters date and return new stream
    Stream<Integer> stream = Stream.of(12, 45, 1, 7, 22, 90);
    System.out.println("Even numbers from stream ");
    stream.filter(ele -> ele % 2 == 0).forEach(System.out::println); //we can use this also instead of lamba - its called function referance
    System.out.println();

    //map() - This method is used to perform operations on elements and return its stream
    System.out.println("Square of elements of stream ");
    Stream.of(1, 2, 3, 4, 5).map(ele -> ele * ele).forEach(System.out::println);

    //sorted function
    System.out.println("Sorted order assending");
    Stream.of(12, 45, 1, 7, 22, 90).sorted().forEach(System.out::println);

    System.out.println("Sorted deceding");
    Stream
      .of(12, 45, 1, 7, 22, 90)
      .sorted(
        (num1, num2) -> {
          return num2 > num1 ? 1 : -1;
        }
      )
      .forEach(System.out::println); //we have to pass comparator to the sorted() method
  
    //get min - min()
    System.out.println("Min element is "+Stream.of(67,12,34,27).min((num1,num2)->{return num1>num2?1:-1;}).get());

    //get max - max()
    System.out.println("Min element is "+Stream.of(67,12,34,27).max((num1,num2)->{return num1>num2?1:-1;}).get());

}
}
