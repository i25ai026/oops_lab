import java.util.*;

class Converter extends Thread {
    String postfix;
    String infix = "";

    Converter(String postfix) {
        this.postfix = postfix;
    }

    public void run() {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            } else {
                String op2 = stack.pop();
                String op1 = stack.pop();
                String exp = op1 + ch + op2;
                stack.push(exp);
            }
        }

        infix = stack.pop();
        System.out.println("Infix Expression: " + infix);
    }
}

class Evaluator extends Thread {
    String postfix;
    int result;

    Evaluator(String postfix) {
        this.postfix = postfix;
    }

    public void run() {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }

        if (!stack.isEmpty()) {
            result = stack.pop();
            System.out.println("Evaluation Result: " + result);
        } else {
            System.out.println("Evaluation not possible (contains variables)");
        }
    }
}

public class PolishNotationThread {
    public static void main(String[] args) {
        String postfix = "AB*CD/+"; 

        Converter t1 = new Converter(postfix);
        Evaluator t2 = new Evaluator(postfix);

        t1.start();
        t2.start();
    }
}