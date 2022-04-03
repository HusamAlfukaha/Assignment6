package Assignment6;

public class Application {
    public static void main(String[] args) {


        Func<Integer, Func<Integer, Integer>> summation = a->b-> a+b;
        BiFunc<Integer, Integer, Integer> unCurringSummation = (a, b) -> summation.apply(a).apply(b);
        System.out.println("unCurringSum.apply(15, 20) = " + unCurringSummation.apply(15, 20));

    }
}
