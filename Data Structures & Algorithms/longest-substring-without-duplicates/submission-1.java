// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int maxLen = 0;
//         for(int i = 0; i<n; i++) {
//             Set<Character> set = new HashSet<>();
//             for(int j = i; j<n; j++) {
//                 char ch = s.charAt(j);
//                 if(set.contains(ch)) {
//                     break;
//                 }
//                 set.add(ch);
//                 maxLen = Math.max(maxLen, j-i+1);
//             }
//         }
//         return maxLen;
//     }
// }

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while(map.get(ch)>1) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
    return maxLen;
    }

}