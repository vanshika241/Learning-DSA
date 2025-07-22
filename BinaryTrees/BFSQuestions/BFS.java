import java.util.*;

public class BFSImp{

    public static class Node {
      int value;
      Node left;
      Node right;
      Node next;

      Node(int val){
        this.value = val;
      }
        
    }

    public static ArrayList<ArrayList<Integer>> bfs(Node root){
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         if (root == null) return ans;
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         while (!q.isEmpty()) {
           int size = q.size();
           ArrayList<Integer> insideList = new ArrayList<>();
           while (size>0) {
              Node curr = q.poll();
              insideList.add(curr.value);
              if(curr.left != null)q.add(curr.left);
              if(curr.right != null)q.add(curr.right);
              size--;
           }
           ans.add(insideList);
         }

         return ans;
    }

    //2.Average of Levels in a binary tree
        public static ArrayList<Double> averageLevels(Node root){
         ArrayList<Double> ans = new ArrayList<>();
         if (root == null) return ans;
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         while (!q.isEmpty()) {
           int size = q.size();
           double average = 0;
           for(int i=0;i<size;i++){
              Node curr = q.poll();
              average += curr.value;
              if(curr.left != null)q.add(curr.left);
              if(curr.right != null)q.add(curr.right);
           }
           ans.add(average/size);
         }

         return ans;
    }

    //3.Level order successor
        public static int levelSuccessor(Node root, int val){
         if (root == null) return 0;
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         while (!q.isEmpty()) {
              Node curr = q.poll();
              if(curr.left != null)q.add(curr.left);
              if(curr.right != null)q.add(curr.right);
              if (curr.value == val ) {
                 break;
              }
        }

         return q.poll().value;
    }

    //4.Zig Zag Level order Traversal
        public ArrayList<ArrayList<Integer>> zigzagLevelOrder(Node root) {
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         if (root == null) return ans;
         Deque<Node> q = new LinkedList<>();
         q.add(root);
         boolean reverse = false;
         while (!q.isEmpty()) {
           int size = q.size();
           ArrayList<Integer> insideList = new ArrayList<>();
           if (reverse == false) {
             while (size>0) {
              Node curr = q.removeFirst();
              insideList.add(curr.value);
              if(curr.left != null)q.addLast(curr.left);
              if(curr.right != null)q.addLast(curr.right);
              size--;
           }
           }
           else{
             while (size>0) {
              Node curr = q.removeLast();
              insideList.add(curr.value);
              if(curr.right != null)q.addFirst(curr.right);
              if(curr.left != null)q.addFirst(curr.left);
              size--;
           }
           }

           reverse = !reverse;
           ans.add(insideList);
         }

         return ans;

        }

        //5.Reverse Level Order Traversal
          public static ArrayList<ArrayList<Integer>> bfs2(Node root){
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         if (root == null) return ans;
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         while (!q.isEmpty()) {
           int size = q.size();
           ArrayList<Integer> insideList = new ArrayList<>();
           while (size>0) {
              Node curr = q.poll();
              insideList.add(curr.value);
              if(curr.left != null)q.add(curr.left);
              if(curr.right != null)q.add(curr.right);
              size--;
           }
           ans.add(0,insideList);
         }

         return ans;
    }

    //6.Populating Next Right Pointers in Each Node
        public Node connect(Node root) {
          if (root == null) {
            return root;
          }
           Node leftMost = root;
           while (leftMost.left != null) {
               Node curr = leftMost;
               while (curr != null) {
                 curr.left.next = curr.right;
                 if (curr.next != null) {
                   curr.right.next = curr.next.left;
                 }
                 curr = curr.next;
               }
               leftMost = leftMost.left;
           }
           return root;
        }

     //7.Binary Tree Right Side View
         public List<Integer> rightSideView(Node root) {
        List<Integer> ans = new ArrayList<>();
          if (root == null) return ans;
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         while (!q.isEmpty()) {
           int size = q.size();
           while (size>0) {
              Node curr = q.poll();
              if(curr.left != null)q.add(curr.left);
              if(curr.right != null)q.add(curr.right);
              size--;
              if (size == 0) {
                ans.add(curr.value);
              }
           }
         }

         return ans;

    }

    //8.Cousins in Binary Tree
    public boolean isCousins(Node root, int x, int y) {
      if (root == null) {
        return false;
      }
        Node xx = findNode(root, x);
        Node yy = findNode(root, y);

        if (xx == null || yy == null) {
          return false;
        }
        return (findLevel(root, xx, 0) == findLevel(root, yy, 0)) && (isSibling(root, xx, yy) == false);
    }

    public Node findNode(Node node , int x){
      if (node == null) {
        return node;
      }
      if (node.value == x) {
        return node;
      }
      Node leftSide = findNode(node.left, x);
      if (leftSide != null) {
        return leftSide;
      }
      return findNode(node.right, x);
    }

    public int findLevel(Node node,Node search, int level ){
      if (node == null) {
         return 0;
      }
      if (node == search) {
        return level;
      }
      int leftLevel = findLevel(node.left, search, level+1);
      if (leftLevel != 0) {
        return leftLevel;
      }
      return findLevel(node.right, search, level+1);
    }

    public boolean isSibling(Node node , Node search1 , Node search2){
      if (node == null ) {
        return false;
      }
      Node f = null;
      Node s = null;
      if(node.left != null)  f  = node.left;
      if(node.right != null)  s  = node.right;
      if ((f == search1 &&  s == search2)|| (f == search2 && s == search1)) {
        return true;
      }
      return isSibling(node.left, search1, search2) || isSibling(node.right, search1, search2);


    }

    //9.Symmetric Tree
    public boolean isSymmetric(Node root) {
        if (root == null) {
          return false;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        while (!q.isEmpty()) {
           Node leftSide = q.poll();
           Node rightSide = q.poll();

           if (leftSide == null && rightSide == null) {
            continue;
           }
           if (leftSide == null || rightSide == null) {
            return false;
           }
           if (leftSide.value != rightSide.value ) {
            return false;
           }
           q.add(leftSide.left);
           q.add(rightSide.right);
           q.add(leftSide.right);
           q.add(rightSide.left);

        }

        return true;

    }


    public static void main(String[] args) {
        
    }
}
