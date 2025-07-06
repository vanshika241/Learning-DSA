public class Traversals {

    public static class Node {
       int value;
       Node left;
       Node right;

       Node(int value){
        this.value = value;
       }
        
    }

    public Node root;

    public void preOrder(){
        preOrder(root);
    }

    public void preOrder(Node node){
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ->");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inorder(){
        inorder(root);
    }

    public void inorder(Node node){
        if (node == null) {
            return ;
        }
        inorder(node.left);
        System.out.print(node.value + " ->");
        inorder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    public void postOrder(Node node){
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ->");

    }



    public static void main(String[] args) {
        Traversals tree = new Traversals();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(15);
        tree.root.left.right = new Node(13);
        
        tree.preOrder();
        System.out.println();
        tree.inorder();
        System.out.println();
        tree.postOrder();
        


    }
}
