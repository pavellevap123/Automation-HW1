public class ParseUtil {
    public static double parseToDouble(String argToParse) throws NumberFormatException {
        return Double.parseDouble(argToParse);
    }

    public static void parseOperator(String operator) throws IncorrectOperatorException {
        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            throw new IncorrectOperatorException("Incorrect operator!");
        }
    }
}

