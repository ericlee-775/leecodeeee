class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        Arrays.fill(last, -1);        // 沒出現過 = -1
        int left = 0, max = 0, index = 0;
        for (char c : s.toCharArray()) {
            if (last[c] >= left) {     // 出現過且在視窗內
                left = last[c] + 1;
            }
            last[c] = index;           // 存真正的索引
            max = Math.max(max, index - left + 1);
            index++;
        }
        return max;
    }
}