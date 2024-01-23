package Task_4;

import java.util.Scanner;
import java.util.Stack;

public class Integers {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        add(i,stack);
        delete(stack);

    }
    public static void add(Integer i,Stack<Integer> stack){
        stack.push(i);
        System.out.println(stack);
    }
    public static void delete(Stack<Integer> stack){
        stack.pop();
        System.out.println(stack);
    }
}
