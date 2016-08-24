package fizzbuzz;
/**
 * Created by Mircea
 */
public class FizzBuzz {
    public static String fizz = "fizz";
    public static String buzz = "buzz";
    public static String fizzbuzz = "fizzbuzz";

    public static String getResult(int n) {
        if (n % 15 == 0)
            return fizzbuzz;
        else if (n % 3 == 0)
            return fizz;
        else if (n % 5 == 0)
            return buzz;
        else
            return String.valueOf(n);
    }
}
