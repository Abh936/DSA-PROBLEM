class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        int maxvalue = 0;
         long[] ans = new long[n];
        for(int i = 0;i<n;i++){
            maxvalue = Math.max(maxvalue,nums[i]);
            ans[i] = nums[i]+maxvalue;
        }
        for(int i = 1;i<n;i++){
            ans[i] = ans[i]+ans[i-1];
        }
        return ans;
    }
}