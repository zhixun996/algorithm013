package week3;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {

        return helper(root, null, null);
    }
    public boolean helper(TreeNode root, Integer u, Integer l) {
        if(root == null) {
            return true;
        }
        int val = root.val;
        if(u != null && val >= u) return false;
        if(l != null && val <= l) return false;

        if(!helper(root.left, val, l)) return false;
        if(!helper(root.right, l, val)) return false;
        return true;
    }
}
