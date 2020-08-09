package week2;

import sun.awt.image.ImageWatched;

import javax.swing.*;
import java.util.*;


public class NTreePreorder {
    //前序迭代 入栈顺序： 根, 右, 左
    public List<Integer> solution1(Node root) {
        List<Integer> result = new ArrayList<>();
        LinkedList<Node> stack = new LinkedList<>();
        stack.add(root);
        while(!stack.isEmpty()) {
            Node node = stack.pollLast();
            result.add(node.val);
            List<Node> childern = node.children;
            Collections.reverse(childern);
            stack.addAll(childern);
        }
        return result;
    }
}


