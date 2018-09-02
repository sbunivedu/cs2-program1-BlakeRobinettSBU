public class Converter {
    
    public Converter() {
    }
    
    public static String convertToPostfix(String s) {
        CharStack operators = new CharStack();
        char[] arr = s.toCharArray();
        String temp = "";
        for (char c : arr) {
            if (Help.isOperand(c)) {
                temp += c;
            } else if (Help.isOperator(c)) {
                //temp += " ";
                while (!operators.isEmpty() && Help.precedenceOrder(operators.peek()) == 2) {
                    temp += operators.pop();
                }
                //temp += " ";
                operators.push(c);
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    temp += operators.pop();
                }
                operators.pop();
            }
        }
        while (!operators.isEmpty()) {
            temp += operators.pop();
        }
        return temp;
    }
}