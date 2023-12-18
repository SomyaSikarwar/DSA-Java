package dsaUsingJava;

public class Main {
    public static void main(String[] args) {
        LInked_list list = new LInked_list();
        list.addTail(10);
        list.addHead(20);
        list.addTail(40);
        list.addTail(30);
        list.removeTail();
        System.out.println(list.contains(30));
        list.Size();
        list.KthNodeFromLast(1);
        list.listToArray();

    }

}