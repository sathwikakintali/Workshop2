import java.util.*;
public class OptionalClass
{
    public static void main(String[] args) {
        Optional<Integer> presentValue = Optional.of(7);
        Optional<Integer> emptyValue = Optional.empty();
        System.out.println(multiplyByTen(presentValue));
        System.out.println(multiplyByTen(emptyValue));
    }
    public static int multiplyByTen(Optional<Integer> value)
    {
       return value. map(n -> n * 10).orElse(0);
    }

    }

