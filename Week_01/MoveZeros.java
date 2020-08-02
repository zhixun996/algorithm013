package wee1JB;

public class MoveZeros {
    public void solution1(int nums[]) {
        int slow = 0;
        for(int fast = 0; fast < nums.length; fast++) {
            if(nums[fast] != 0) {
                nums[slow] = nums[fast];
                if(slow != fast) {
                    nums[fast] = 0;
                }
                //slow指向第一个0前一个元素
                slow++;
            }
        }
    }
    //两次遍历,计算出现0的次数,第二次遍历把数组后续补0
    public void solution2(int nums[]) {
        int zeroCount = 0;
        //第一次遍历把非0元素填到前面的0
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[zeroCount] = nums[i];
                zeroCount++;
            }
        }
        for(int i = zeroCount; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
