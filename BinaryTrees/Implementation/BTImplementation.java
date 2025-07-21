import java.util.Scanner;

public class BTImplementation{

    public static class Node {
       int value;
       Node left;
       Node right;
       Node(int val){
        this.value = val;
        this.left = null;
        this.right = null;
       }
        
    }

    public static Node root;
    
    public static void insert(Scanner scanner){
        System.out.println("Enter the root");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }
    public static void populate(Scanner scanner, Node node) {
       System.out.println("Do you want to enter the left of "+node.value);
       boolean leftCheck  = scanner.nextBoolean();
       if (leftCheck) {
          System.out.println("Enter the left value of "+node.value);
          int value = scanner.nextInt();
          node.left = new Node(value);
          populate(scanner, node.left);
       }

       System.out.println("Do you want to enter the right of "+node.value);
       boolean rightCheck  = scanner.nextBoolean();
       if (rightCheck) {
          System.out.println("Enter the right value of "+node.value);
          int value = scanner.nextInt();
          node.right = new Node(value);
          populate(scanner, node.right);
       }
    }

    public void display(){
        display(root, "");
    }
    public void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");
    }

    
    public static void main(String[] args) {
        BTImplementation tree = new BTImplementation();
        Scanner scanner = new Scanner(System.in);
        tree.insert(scanner);
        tree.display();
    }
}