class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();//mutable help save ozigined
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        while(i>=0||j>=0||carry!=0){
            int digit1 = (i>=0)?num1.charAt(i)-'0':0; // String trick '8' - '0'= 8
            int digit2 = (j>=0)?num2.charAt(j)-'0':0;
            int sum = digit1 + digit2 + carry;
            result.append(sum%10);// move result of caculation to right should 
                                //outside while use reverse
            carry = sum/10;
            i--;
            j--;
        }
        return result.reverse().toString();//
    }
}