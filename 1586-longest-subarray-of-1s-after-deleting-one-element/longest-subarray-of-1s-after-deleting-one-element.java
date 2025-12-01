class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length, i = 0, j = 0;

        // Count total zeroes
        int z = 0;
        for (int ele : nums) {
            if (ele == 0) z++;
        }
        // If no zero exists, answer is n-1 (must delete one element)
        if (z == 0) return n - 1;

        int maxlen = 0, zeroes = 0;

        while (j < n) {

            if (nums[j] == 0) zeroes++;

            // If more than 1 zero, shrink from left
            while (zeroes > 1) {
                if (nums[i] == 0) zeroes--;
                i++;
            }

            // effective length = j - i (because we delete 1 zero)
            maxlen = Math.max(maxlen, j - i);

            j++;
        }

        return maxlen;
    }
}
