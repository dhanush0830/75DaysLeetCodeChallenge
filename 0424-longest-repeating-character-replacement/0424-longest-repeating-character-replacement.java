class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxCount = 0, result = 0;

        for (int right = 0; right < s.length(); right++) {
            maxCount = Math.max(maxCount, ++freq[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxCount > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
        
    }
}