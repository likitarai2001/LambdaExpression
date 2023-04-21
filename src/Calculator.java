public class Calculator {
    @FunctionalInterface
    interface Operation {
        int calculate(int a, int b);
    }

    public int compute(int a, int b, Operation obj) {
        return obj.calculate(a, b);
    }
}
