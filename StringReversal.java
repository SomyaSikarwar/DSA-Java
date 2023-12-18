package dsaUsingJava;
import java.util.Scanner;
import java.util.Stack;

public class String_Reversal {
    Stack<Character> stack = new Stack<>();
    public void reverse(String string){
        for(int i =0 ;i < string.length();i++){
            stack.push(string.charAt(i));
        }
        while(!stack.empty()){
            String len = "";
            len += stack.pop();
            System.out.println(len);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String_Reversal str = new String_Reversal();
        str.reverse("Somya");

    }

}
