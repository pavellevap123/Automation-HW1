import java.io.*;

public class Calculator {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.print("Введите первое число: ");
                String firstOperand = reader.readLine();
                double firstDigit = ParseUtil.parseToDouble(firstOperand);
                System.out.print("Введите второе число: ");
                String secondOperand = reader.readLine();
                double secondDigit = ParseUtil.parseToDouble(secondOperand);
                System.out.print("Введите знак оперции(+ - * /): ");
                String operator = reader.readLine();
                ParseUtil.parseOperator(operator);
                MathUtil.checkByZeroDivision(operator, secondDigit);
                System.out.println(MathUtil.count(firstDigit, secondDigit, operator));
                break;
            } catch (IOException |
                     NumberFormatException |
                     IncorrectOperatorException|
                     ZeroDivisionException e) {
                if (e instanceof NumberFormatException) {
                    System.out.println("Введен некоректный операнд");
                } else if (e instanceof IncorrectOperatorException) {
                    System.out.println("Введен некоректный оператор");
                } else if (e instanceof ZeroDivisionException) {
                    System.out.println("Нельзя делить на ноль!");
                    break;
                }
            }
        }
    }
}
