package dsaUsingJava;
import java.util.Scanner;
public class LInked_list {
    private class node {
        private int item;
        private node next;
        private node(int item){
            this.item = item;
        }
    }

    private node head;
    private node tail;
    int size;

    public void addTail(int num){
        node Node = new node(num);
        if(head == null){
           head = tail = Node;
        }
        else{
            tail.next = Node;
            tail = Node;
        }
        size++;
    }

    public void addHead(int num){
        node Node = new node(num);
        if(head == null){
            head = tail = Node;
        }
        else {
            Node.next = head;
            head = Node;
        }
        size++;
    }

    public int indexOf(int num){
        int index = 0 ;
        var count = head;

        while(count != null){
            if(count.item == num )return index;
            count = count.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int num){
        node current = head ;
        while(current != null){
            if(current.item == num){
                return true;
            }
            else{
                current =current.next;
            }
        }
        return false;
    }

    public void removeHead(){
        // if the list contains single item
        if(head == tail){
            head = tail = null;
        }
        node second = head.next;
        head.next = null;
        head = second;
        size--;
    }

    public void removeTail(){
        node pointer = head;
        while(pointer != null){
            if(pointer.next == tail){
               break;
            }
            pointer = pointer.next;
        }
        tail = pointer;
        pointer.next = null;
        size--;
    }
    public void Size(){
        System.out.println(size);
    }

    public void listToArray(){
        int[] arr = new int[size];
        node ptr = head;
        for(int i = 0 ; i < size ; i++){
            arr[i] = ptr.item;
            ptr = ptr.next;
        }
        for(int i = 0 ; i < size ; i++){
            System.out.print(" "+ arr[i]);
        }
    }
    public void reverse(){

    }


}



