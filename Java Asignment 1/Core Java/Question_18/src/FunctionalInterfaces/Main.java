package FunctionalInterfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.*;
public class Main {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args)
    {
        // Creating instance of consumer
        Consumer<String> print = x -> System.out.println(x);
        // calling its method
        print.accept("Pratibha"); // print the string


        // creating instance of supplier
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        // calling its method
        LocalDateTime time = s.get(); // return current date & time
        System.out.println(time);


        // Creating instance of predicate
        Predicate<Integer> lesserthan = i -> (i < 18);
        // Calling its method
        System.out.println(lesserthan.test(10)); // returns true

        // Creating instance of function
        Function<String, Integer> func = x -> x.length();
        // Calling its method to return length of string
        Integer apply = func.apply("Pratibha");
        System.out.println(apply);

    }
}
