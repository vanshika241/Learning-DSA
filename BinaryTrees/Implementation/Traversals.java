public class Traversals {
    public static class Node {
     int value;
     Node left;
     Node right;

     Node(int value){
        this.value = value;
     }
        
    }

    public static void preorder(Node node){
        if (node == null) {
            return;
        }
        System.out.print(node.value+" ->");
        preorder(node.left);
        preorder(node.right);
    }

    public static void inorder(Node node){
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.value+" ->");
        inorder(node.right);
    }
    
    public static void postorder(Node node){
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value+" ->");
    }
    public static void main(String[] args) {
        
    }
}
