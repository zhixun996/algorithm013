package week2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NTreePostOrder {
    /**
     * 迭代后序遍历
     */
    public List<Integer> postOrder(Node root) {
        LinkedList<Integer> result = new LinkedList<>();
        if(root == null) {
            return result;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node cur = stack.pop();
            result.addFirst(cur.val);
            stack.addAll(cur.children);
        }
        return result;
    }
}
