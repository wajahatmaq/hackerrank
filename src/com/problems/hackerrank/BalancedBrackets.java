package com.problems.hackerrank;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        String brackets="[()]{}{[()()]()}";

        System.out.println(balanceBrackets(brackets));
    }

    private static boolean balanceBrackets(String brackets) {
        Character c;
        Stack<Character> s =  new Stack<Character>();
        for(int i=0; i<brackets.length(); i++){
            c = brackets.charAt(i);
            if (c.equals("{") || c.equals("[") || c.equals("(")) {
                s.push(c);
            }
            else if (c.equals("}") && s.peek().equals("{")){
                s.pop();
            }
            else if (c.equals("]") && s.peek().equals("[")){
                s.pop();
            }
            else if (c.equals(")") && s.peek().equals("(")){
                s.pop();
            }
        }

        return s.isEmpty();
    }

}
