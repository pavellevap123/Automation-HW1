import java.io.*;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean correctInput = false;

        double first = 0;
        double second = 0;

        while (!correctInput) {
            System.out.print("Введите первое число: ");
            String firstDigit = reader.readLine();
            System.out.print("Введите второе число: ");
            String secondDigit = reader.readLine();
            try {
                first = Double.parseDouble(firstDigit);
                second = Double.parseDouble(secondDigit);
                correctInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Введены некоректные данные!");
            }
        }

        System.out.print("Введите операцию(+ - * /): ");

        boolean correctOperation = false;

        String operation = reader.readLine();

        while (!correctOperation) {
            if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
                if (second == 0 && operation.equals("/")) {
                    System.out.println("На ноль делить нельзя!");
                    break;
                }
                double result = switch (operation) {
                    case "+" -> first + second;
                    case "-" -> first - second;
                    case "*" -> first * second;
                    case "/" -> first / second;
                    default -> 0;
                };
                System.out.print("Результат равен: ");
                System.out.println(result);
                correctOperation = true;
            } else {
                System.out.println("Введены некоректные данные! Попробуйте еще раз!");
                System.out.print("Введите операцию(+ - * /): ");
                operation = reader.readLine();
            }
        }
    }
}
