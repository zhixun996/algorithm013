package wee1JB;

public class RotateArray {
    public static int[] arr = {1,2,3,4,5,6,7,8,9};
    //暴力循环 这种写法我是真的喜欢 不用思考
    public static void rotate1(int[] nums, int k) {
        k = k % nums.length;
        for(int i = 0; i < k; i++) {
            int temp, previous = nums[nums.length - 1];
            for(int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

    public static void rotate2(int []nums, int k) {
        k = k % nums.length;
        int count = 0; //最大移动次数,k取数组长度余后小于数组长度
        for(int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                //算出下次要移动的元素
                int next = (current + k) % nums.length;
                //将下次要移动的元素存进缓存,将当前元素替换至nums[next]
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            }while(current != start);
        }
    }

    public static void main(String args[]) {
        rotate2(arr ,1);
        for(int i : arr) {
            System.out.print(i);
        }
    }
}
