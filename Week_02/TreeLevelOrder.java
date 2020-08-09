package week2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeLevelOrder {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> element = new ArrayList<Integer>();
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                Node n = queue.poll();
                queue.addAll(n.children);
                element.add(n.val);
            }
            result.add(element);
        }
        return result;
    }
}
