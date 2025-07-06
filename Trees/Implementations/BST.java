public class BST {
    public static class Node {
      int value;
      int height;
      Node left;
      Node right;

      public Node(int value){
        this.value = value;
      }

        
    }

    public Node root;
    public  int height(Node node){
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
      display(root , "Root Node");
    }

    public void display(Node node , String details){
      if (node == null) {
        return;
      }
      System.out.println(details + node.value);
      display(node.left , "Left child of "+node.value + " is ");
      display(node.right , "Right child of "+node.value + " is ");

    }

    //insert function
    public   void insert(int value){
       root = insert(value,root);
    }

    public   Node insert( int value,Node node){
       if (node == null) {
        node = new Node(value);
        return node;
       }

       if (value<node.value) {
        node.left = insert(value, node.left);
       }

       if (value>node.value) {
        node.right = insert(value, node.right);
       }
       node.height = Math.max(height(node.left), height(node.right))+1;
       return node;
    }

    public boolean isBalanced(){
      return isBalanced(root);
    }
    
    public boolean isBalanced(Node node){
      if (node == null) {
        return true;
      }
      return Math.abs(height(node.left)-height(node.right))<=1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void populate(int nums[]){
      for(int i=0;i<nums.length;i++){
        insert(nums[i]);
      }
    }

    public void populateSorted(int nums[]){
      populateSorted(nums, 0, nums.length-1);
    }

    public void populateSorted(int nums[], int start, int end){
      if (start>=end) {
        return;
      }
      int mid = start+(end-start)/2;
      insert(nums[mid]);;
      populateSorted(nums,start,mid-1);
      populateSorted(nums,mid+1,end);
    }


    public static void main(String[] args) {
        BST tree = new BST();
        int nums[] = {15,10,20,5,12,3};
        tree.populate(nums);
        tree.display();
    }
}
