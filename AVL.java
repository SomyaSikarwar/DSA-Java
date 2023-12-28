package dsaUsingJava;

public class AVL {

    private class Node{
        public int height;
        int item;
        Node left , right;

        public Node(int item){
            this.item = item;
        }
    }
    Node root;

    public int height(Node value){
        return (value != null)? 0 : value.height;
    }

    /*public void insert(int value){
        if(root == null){
            root = new Node(value);
            return;
        }
        var current = root;
        while(true){
            if( value > current.item ){
              //  System.out.println("Height of the current node"+height(current));
                if(current.right == null){
                    current.right = new Node(value);
                    break;
                }
                current = current.right;
            }
            else{
                if(current.left == null){
                    current.left = new Node(value);
                    break;
                }
                current = current.left;
            }
        }
    }*/

    public void insert(int value){
       root = insert(root , value);
    }

    private Node insert(Node root ,int value){
        if(root == null){
            return new Node(value);
        }
        if(value > root.item){
            root.right = insert(root.right,value);
        }
        else
            root.left = insert(root.left,value);
        return root;
    }

}
