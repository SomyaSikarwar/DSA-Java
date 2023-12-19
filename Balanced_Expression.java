package dsaUsingJava;

import java.util.Stack;

public class CheckBalancedExp {
    public void expression(String exp){
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < exp.length() ; i++){
            if(exp.charAt(i) == '(' || exp.charAt(i) == '[' || exp.charAt(i) == '{'){
                stack.push(exp.charAt(i));
            }

            if(exp.charAt(i) == ')'|| exp.charAt(i) == ']'||exp.charAt(i) == '}'){
                    if(stack.empty()){
                        System.out.println("Expression is not balanced");
                        return;
                    }
                    var temp = stack.pop();
                    if(exp.charAt(i) == ')' && temp != '(' || exp.charAt(i) == ']' && temp != '[' || exp.charAt(i) == '}' && temp != '{'){
                        System.out.println("Expression is not balanced");
                    return; //stopping the process if brackets are not balanced
                    }

            }
        }
        if(stack.empty()){
            System.out.println("Expression is balanced");
        }
        else{
            System.out.println("Expression is not balanced");
        }

    }
}


public class Main {
    public static void main(String[] args) {
        CheckBalancedExp e = new CheckBalancedExp();
        e.expression("(2+30]}");
    }

}
