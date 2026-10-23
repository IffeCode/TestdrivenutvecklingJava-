public class FastCalculator implements Calculator {

    @Override
    public boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
