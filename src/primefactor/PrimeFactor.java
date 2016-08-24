package primefactor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Created by Mircea
 */
public class PrimeFactor {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public ArrayList<Integer> primeDecompositionOf(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int divisor = 2; n > 1; divisor++)
            for (; n % divisor == 0; n /= divisor)
                result.add(divisor);
        return result;
    }


    public void print(List<Double> accounts, String src, String dest, double threshold) {
        for (Double ammount : convert(accounts, src, dest)) {
            if (ammount < threshold) {
                System.out.println(ammount);
            }
        }
    }

    public List<Double> convert(List<Double> ac, String src, String dest) {
        final List<Double> result = ac.stream().map(amount -> amount * 23).collect(Collectors.toList());
        return ac;
    }
}