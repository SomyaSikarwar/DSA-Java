package dsaUsingJava;

import java.util.Stack;

public class queue {
    // Queue Using Array
    /*int[] array ;
    int rear,front;

    public queue(int size){
        array = new int[size];
    }

    public void enqueue(int item){
        array[rear] = item;
       rear = (rear + 1 ) % array.length;
    }

    public void dequeue(){
        array[front] = 0;
        front = (front + 1) % array.length ;
    }
    public void PrintQueue(){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(","+array[i]);
        }
    }*/

    //queue using stacks
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int item){
        s1.push(item);
        s2.push(s1.pop());
    }

    public int dequeue(){
        var element = s2.pop();
        return element;
    }


}
