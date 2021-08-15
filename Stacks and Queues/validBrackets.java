/*3. Write a program to check if an expression of brackets is valid or not using stacks.
(Balanced parentheses in an expression) Consider there are 3 types of brackets: “{}, [], & ()”.
Ex: - input: “[{({})}]”, output: “Balanced”. Input: “[(]}]”, output: “Not balanced”.*/

import java.util.*;
public class validBrackets {
    static boolean areBracketsBalanced(String expr){
        Deque<Character> stack
            = new ArrayDeque<Character>();
        for (int i = 0; i < expr.length(); i++){
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{'){
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;

            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;

            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args)
    {
        String expr = "([{}])";
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}