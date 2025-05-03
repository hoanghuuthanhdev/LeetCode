class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int i = digits.length - 1;
        while(carry == 1 && i>=0) {
            int temp = digits[i] + carry;
            carry = temp / 10;
            temp %= 10;
            digits[i] = temp;
            i--;
        }

        if(carry == 1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        
        return digits;
    }
}