package wee1JB;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] solution1(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(target == nums[j] + nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public int[] solution2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
