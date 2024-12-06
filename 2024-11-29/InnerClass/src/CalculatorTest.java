public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.performOperations(10, "+", 5);
        calculator.performOperations(10, "-", 5);
        calculator.performOperations(10, "*", 5);
        calculator.performOperations(10, "/", 5);
    }
}
