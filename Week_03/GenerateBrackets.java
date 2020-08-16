package week3;

public class GenerateBrackets {
    /**
     *生成括号,
     */
    public static void solution1(int n, int left, int right, String s) {
        if(s.length() == n * 2) {
            System.out.println(s);
            return;
        }
        if(left < n)
            solution1(n, left + 1, right, s + "(");
        if(right < left)
            solution1(n, left, right + 1, s + ")");
    }
    public static void main(String args[]) {
        solution1(3,0,0,"");
    }
}
