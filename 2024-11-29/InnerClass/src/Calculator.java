public class Calculator {
    class Operation {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public int divide(int a, int b) {
            return a / b;
        }
    }

    public void performOperations(int  a, String operator, int b) {
        Operation operation = new Operation();
        switch (operator) {
            case "+" -> System.out.println(operation.add(a, b));
            case "-" -> System.out.println(operation.subtract(a, b));
            case "*" -> System.out.println(operation.multiply(a, b));
            case "/" -> System.out.println(operation.divide(a, b));
            default -> System.out.println("不支援此運算");
        }
    }
}
