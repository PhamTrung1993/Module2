package codegym;

import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        boolean status = true;
        String infixExpression = "(((A-B)+C))/D";
        String[] splited = infixExpression.split("");
        Stack<String> bStack = new Stack<>();
        status = getaBoolean(status, splited, bStack);
        System.out.println("Expression: " + infixExpression+ " is " + status);
    }

    private static boolean getaBoolean(Boolean status, String[] splited, Stack<String> bStack) {
        String left;

        for (int i = 0; i < splited.length; i++) {
            if (splited[i].equals("(")) {
                bStack.push(splited[i]);
                System.out.println(bStack.size());
            }
            if (splited[i].equals(")")){
                if (bStack.size() == 0){
                    status = false;
                    break;
                }
                else {
                    left = bStack.pop();
                }
            }
        }
        return status;
    }
}
