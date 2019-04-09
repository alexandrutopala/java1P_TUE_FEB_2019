import java.util.*;

public class Exemplu1 {
    public static void main(String [] args) {
        
        List<Integer> list = Arrays.asList(3, 1, 2, 10, 4, 5, 9);
        
        list.parallelStream()
            .filter(i -> i % 2 == 0)
            .forEachOrdered(System.out::println);
    }
}