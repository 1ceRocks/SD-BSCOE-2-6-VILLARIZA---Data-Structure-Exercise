import java.util.Stack;
import java.util.Scanner;

public class BalancedParenthesis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a set of number N for sample output: ");
        int num =  scanner.nextInt();
        String[] str = new String[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Type a string to check its balance for both sides (" + i + "): ");
            str[i] = scanner.next();
        }

        for (int i = 0; i < num; i++){
            boolean balance = isBalanced(str[i]);
            if (balance) {  
                System.out.println("(" + i + ") BALANCED");
            }
            else {
                System.out.println("(" + i + ") NOT BALANCED");
            }   
        }
    }

    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            } else if (ch == '}') {
                if (stack.isEmpty() || stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}