class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            System.out.println("Checking character at index " + i + ": " + c); 

            for (int j = 1; j < strs.length; j++) { // ✅ Sửa lại ở đây
                // Nếu chuỗi hiện tại ngắn hơn vị trí i hoặc ký tự không trùng
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    System.out.println("Mismatch found at string " + j + " -> " + strs[j]);
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0]; // Nếu không có sai khác, trả về toàn bộ chuỗi đầu tiên
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] input = {"flower", "flow", "flight"};
        String result = sol.longestCommonPrefix(input);
        System.out.println("Longest Common Prefix: " + result);
    }
}
