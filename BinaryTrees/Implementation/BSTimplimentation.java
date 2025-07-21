public class BSTimplimentation {

    public static class Node {
        int value;
        int height;
        Node left;
        Node right;
        
        Node(int value){
            this.value = value;
            this.height = 0;
        }
        
    }

    public static Node root;
    public static int getHeight(Node node){
        if(node == null)return -1;
        return node.height;
    }

    public static boolean isEmpty(){
       return root == null;
    }

    public static void insert(int val){
        root = insert(root, val);
        return;
    }
    public static Node insert(Node node, int value){
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        }
        if (value > node.value) {
            node.right = insert(node.right, value);
        }
        node.height = Math.max(getHeight(node.left), getHeight(node.right))+1;
        return node;
    }

    public static boolean checkBalanced(Node root){
        return balanced(root);
    }
    public static boolean balanced(Node node){
        if (node == null) {
            return true;
        }
        return Math.abs(getHeight(node.left)-getHeight(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }

    public static void display(Node root){
        display(root,"Root Node :");
    }
    public static void display(Node node, String details) {
        if (node == null) {
            return ;
        }
        System.out.println(details +" "+node.value);
        display(node.left,"Left child of "+node.value+ " is");
        display(node.right,"Right child of "+node.value+ " is");
    }

    public static void populate(int nums[]){
        for(int i=0;i<nums.length;i++){
            insert(nums[i]);
        }
    }

    public static void populateSorted(int nums[]){
        populateSorted(nums,0,nums.length-1);
        return;
    }
    public static void populateSorted(int nums[], int start, int end){
        if (start>end) {
            return;
        }
        int mid = start+(end-start)/2;
        insert(nums[mid]);
        populateSorted(nums,start,mid-1);
        populateSorted(nums,mid+1,end);
    }

    public static void main(String[] args) {
        // int nums[] = {15,10,5,8,20};
        // populate(nums);
        int nums[] = {1,2,3,4,5,6,7,8,9};
        populateSorted(nums);
        display(root);
    }
}
