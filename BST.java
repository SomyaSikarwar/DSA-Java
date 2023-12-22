package dsaUsingJava;

import java.util.Stack;

public class BST {
    //using doubly linked list
   public class Node{
        int item ;
        Node left,right;

        public Node(int item){
            this.item = item;
        }
    }

    Node root;
    public void insert(int element){
        if(root == null){
           root = new Node(element);
            return;
        }
        var current = root;
         while(true) {
             if (element > current.item) {
                 if(current.right == null) {
                     current.right = new Node(element);
                     break;
                 }
                 current = current.right;

             }
             else {
                 if(current.left == null) {
                     current.left = new Node(element);
                     break;
                 }
                 current = current.left;
             }
         }

        }
        public void find(int value){
            var current = root;
            while(current!=null){
               if( value <= current.item ){
                   if(current.item == value){
                       System.out.println(value + " is found");
                       break;
                   }
                   current = current.right;
               }
               //left
               else{
                   if(current.item == value){
                       System.out.println(value + " is found");
                       break;
                   }
                   current = current.left;
               }

            }

        }

        public void PreOrder() {
            preorder(root);
        }
        private void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.item+" ");
        preorder(root.left);
        preorder(root.right);
        }
       /* public void preorder(){
            if(root == null){
                return;
            }
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            Node current;
            while(!stack.isEmpty()) {
                current=  stack.pop();
                System.out.println(current.item);

                if(current.left != null){
                    stack.push(current.left);
                }
                if(current.right != null){
                    stack.push(current.right);
                }

            }

        }*/
       public void PostOrder() {
           postorder(root);
       }
       private void postorder(Node root){
           if(root == null){
               return;
           }
           postorder(root.left);
           postorder(root.right);
           System.out.print(root.item+" ");
       }

       public void min(){
           var current = root;
           while(true){
               if(current.left == null){
                   System.out.println(current.item);
                   break;
               }
               else{
                   current = current.left;
               }
           }
       }

       public int height(){
           return height(root);
       }
       private int height(Node root){
           if(root==null){
               return 0;
           }
           return 1+ Math.max(height(root.left),height(root.right));
       }

}




