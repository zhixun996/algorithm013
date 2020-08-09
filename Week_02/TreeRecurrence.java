package week2;

public class TreeRecurrence {
    public void preOrder(BinaryTree node) {
        System.out.print(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(BinaryTree node) {
        inOrder(node.left);
        System.out.print(node.right);
        inOrder(node.right);
    }
    public void postOrder(BinaryTree node) {
        inOrder(node.left);
        inOrder(node.right);
        System.out.print(node.right);
    }
}
class BinaryTree {
    public BinaryTree left;
    public BinaryTree right;
    public int val;

}
