package wee1JB;

public class MergeTwoSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = m + n -1;
        int node1 = m - 1;
        int node2 = n - 1;
        while(node2 >= 0 && node1 >= 0){
            nums1[j--] = (nums1[node1] > nums2[node2])? nums1[node1--] : nums2[node2--];
        }
        System.arraycopy(nums2, 0, nums1, 0, node2 + 1);
    }
}
