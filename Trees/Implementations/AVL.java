public class AVL {
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
       return rotate(node);
    }

    public Node rotate(Node node){
        if (height(node.left)-height(node.right)>1) {
            //left heavy
            if (height(node.left.left)-height(node.left.right)>0) {
                return rightRotate(node);
            }
            if (height(node.left.left)-height(node.left.right) <0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (height(node.left)-height(node.right)<-1) {
            if (height(node.right.left)-height(node.right.right)<0) {
                return leftRotate(node);
            }
            if (height(node.right.left)-height(node.right.right) >0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    public Node rightRotate(Node p){
       Node c = p.left;
       Node t= c.right;
       c.right = p;
       p.left = t;
       p.height = Math.max(height(p.left), height(p.right))+1;
       c.height = Math.max(height(c.left), height(c.right))+1;
       return c;
    }

    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;
        p.left = c;
        c.right = t;
        c.height = Math.max(height(c.left), height(c.right))+1;
        p.height = Math.max(height(p.left), height(p.right))+1;
        return p;


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
        AVL tree = new AVL();
        int nums[] = {1,2,3,4,5,6,7,8,9};
        tree.populate(nums);
        tree.display();
    }
}
