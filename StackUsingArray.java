package dsaUsingJava;

public class stack {
    private int[] stack = new int[5];
    private int count = 0;
    public void push(int num){
       stack[count] = num;
       count++;
    }

    public boolean isEmpty(){
        if(count == 0 ) return true;
        return false;
    }
    public void pop(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        --count;
    }

    public void peek(){
        if(count == 0){
            throw new IllegalStateException();
        }
        int Peek = stack[count - 1];
        System.out.println(Peek);
    }
}

public class Main {
    public static void main(String[] args) {
        stack Stack = new stack();
        Stack.push(10);
        Stack.push(20);
        Stack.push(2);
        Stack.push(9);
        Stack.pop();
        Stack.pop();
        Stack.peek();
    }

}
  
