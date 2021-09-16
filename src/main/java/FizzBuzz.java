
public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.convert(i));
        }
    }
}
