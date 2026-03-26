class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        
        double maxSum = windowSum;
        
        for (int i = k; i < n; i++) {
            windowSum += nums[i];
            windowSum -= nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        
        return maxSum / k;
    }
}