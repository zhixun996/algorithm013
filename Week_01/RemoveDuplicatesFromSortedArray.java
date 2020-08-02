package wee1JB;

public class RemoveDuplicatesFromSortedArray {
    public static int solution(int[] arr) {
        int j = 0;
        //j指向数组中重复元素的前一个
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }
}
