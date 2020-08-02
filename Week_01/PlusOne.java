package wee1JB;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if(digits[i] != 0) {
                return digits;
            }
        }
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }
}
