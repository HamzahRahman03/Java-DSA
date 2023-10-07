import java.util.*;
public class Leetcode199_BinaryTreeRigthSideView {
    
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    int maxLevel = 0;

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        rightView (root, 1, ll);
        return ll;        
    }

    public void rightView(TreeNode root, int currLevel, List<Integer> ll){
        if(root == null){
            return;
        }

        if(currLevel > maxLevel){
            ll.add(root.val);
            maxLevel = currLevel;
        }

        rightView (root.right, currLevel + 1, ll);
        rightView (root.left, currLevel + 1, ll);
    }
}
    
}
