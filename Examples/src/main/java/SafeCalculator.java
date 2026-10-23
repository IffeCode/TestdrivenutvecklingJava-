public class SafeCalculator implements Calculator {

    @Override
    public boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
