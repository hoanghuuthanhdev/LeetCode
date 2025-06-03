class Solution {
    // Pefix: chuỗi bắt đầu từ ký tự đầu tiên
    // Suffix: chuỗi kết thúc từ các ký tự cuối cùng
    // Substring: chuỗi con nằm ở bất kỳ vị trí nào trong chuỗi

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for(int i = 1; i<strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
          return prefix;
    } 
}

// class Solution2 {
//     public String longestCommonPrefix(String[] strs) {
//         if (strs == null || strs.length == 0) return "";

//         for (int i = 0; i < strs[0].length(); i++) {
//             char c = strs[0].charAt(i);
//             System.out.println("Checking character at index " + i + ": " + c); 

//             for (int j = 1; j < strs.length; j++) {
//                 // Nếu chuỗi hiện tại ngắn hơn vị trí i hoặc ký tự không trùng
//                 if (i >= strs[j].length() || strs[j].charAt(i) != c) {
//                     System.out.println("Mismatch found at string " + j + " -> " + strs[j]);
//                     return strs[0].substring(0, i);
//                 }
//             }
//         }

//         return strs[0]; // Nếu không có sai khác, trả về toàn bộ chuỗi đầu tiên
//     }

    
// }
