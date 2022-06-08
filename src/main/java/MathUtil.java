public class MathUtil {
    public static double summarize(double first, double second) {
        return first + second;
    }

    public static double subtract(double first, double second) {
        return first - second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double divide(double first, double second) {
        return first / second;
    }

    public static double count(double num1, double num2, String operator) {
        return switch (operator) {
            case "+" -> MathUtil.summarize(num1, num2);
            case "-" -> MathUtil.subtract(num1, num2);
            case "*" -> MathUtil.multiply(num1, num2);
            case "/" -> MathUtil.divide(num1, num2);
            default -> 0;
        };
    }

    public static void checkByZeroDivision(String operator, double num2) throws ZeroDivisionException {
        if (operator.equals("/") && num2 == 0) {
            throw new ZeroDivisionException("Нельзя делить на ноль!");
        }
    }
}
