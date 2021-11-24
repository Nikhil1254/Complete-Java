package java8_optional;

import java.util.Optional;

public class Main {

  public static void main(String[] args) {
    Optional<String> str = display();

    System.out.println(str.isPresent());
    System.out.println(str.isEmpty());
    System.out.println(str.get()); //throws exception if its empty optional
    System.out.println(str.orElse("No string passed!"));
    /*

            - Optional is a class which is mainly used to avoid null pointer exceptions
            - Its basically like a box which can be empty or which can have a value.
            - mainly used with functions return type so caller can check if return value is null or not

            - Some important methods :
                - empty() returns empty optional
                - orElse() if there is value it prints that otherwise print string we provided
                - 
        */
  }

  public static Optional<String> display() {
    String str = "Hello Nikhil";
    return Optional.ofNullable(str);
  }
}
