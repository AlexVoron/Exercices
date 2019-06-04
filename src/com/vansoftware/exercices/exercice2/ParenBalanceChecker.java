package com.vansoftware.exercices.exercice2;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParenBalanceChecker {
    public static boolean checkBalance(String input) {
        if (input == null)
            return true;

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            char c1;

            switch (c) {
                case '(' :
                case '[' :
                case '{' :
                    stack.push(c);
                    break;
                case ')' :
                    if (stack.isEmpty())
                        return false;
                    c1 = stack.pop();
                    if (c1 != '(')
                        return false;
                    break;
                case ']' :
                    if (stack.isEmpty())
                        return false;
                    c1 = stack.pop();
                    if (c1 != '[')
                        return false;
                    break;
                case '}' :
                    if (stack.isEmpty())
                        return false;
                    c1 = stack.pop();
                    if (c1 != '{')
                        return false;
                    break;
            }
        }

        return stack.size() == 0;
    }
}
