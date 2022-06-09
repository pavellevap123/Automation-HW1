public class MathUtil {

    public static double count(double num1, double num2, String operator) throws IncorrectOperatorException {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new IncorrectOperatorException("Incorrect operator");
        };
    }

    public static void checkByZeroDivision(String operator, double num2) throws ZeroDivisionException {
        if (operator.equals("/") && num2 == 0) {
            throw new ZeroDivisionException("Нельзя делить на ноль!");
        }
    }
}
