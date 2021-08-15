/*10.     Write a program to convert: (using stack)
a. Infix to postfix. Ex: - infix: “a+b*(c^d-e)^(f+g*h)-i”, postfix: “abcd^e-fgh*+^*+i-“.
*/

import java.util.*;
class conversionInfix_Postfix{
    static int Prec(char ch){
        switch (ch){
			case '+':
			case '-':
				return 1;

			case '*':
			case '/':
				return 2;

			case '^':
				return 3;
		}
		return -1;
    }
    static String infixToPostfix(String exp){
        String result = new String("");
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<exp.length(); ++i){
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c))
                result += c;
            else if (c == '(')
                stack.push(c);
            else if (c == ')'){
                while (!stack.isEmpty() &&
                        stack.peek() != '(')
                    result += stack.pop();

                    stack.pop();
            }
            else{
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){
                    result += stack.pop();
             	}
                stack.push(c);
            }

        }
        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
         }
        return result;
    }
    static String postfixToInfix(String exp){
	    Stack<String> s = new Stack<String>();
	    for (int i = 0; i < exp.length(); i++){
	        if (isOperand(exp.charAt(i))){
	        	s.push(exp.charAt(i) + "");
	        }
	        else{
	            String op1 = s.peek();
	            s.pop();
	            String op2 = s.peek();
	            s.pop();
	            s.push("(" + op2 + exp.charAt(i) + op1 + ")");
	        }
	    }
	    return s.peek();
	}
	static boolean isOperand(char x){
	    return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z');
	}
    public static void main(String[] args){
        String str1 = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Infix to Postfix: "+str1 + " --> " +infixToPostfix(str1));
        String str2 = "ab*c+";
    	System.out.println("Postfix to Infix: "+ str2 + " --> " +postfixToInfix(str2));
    }
}