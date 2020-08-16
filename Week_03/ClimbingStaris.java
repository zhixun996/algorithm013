package week3;

public class ClimbingStaris {
    //这个方法tm超时了我操
    public int solution1(int n) {
        if(n <= 2) {
            return n;
        }else {
            return solution1(n-1) + solution1(n-2);
        }
    }
}
