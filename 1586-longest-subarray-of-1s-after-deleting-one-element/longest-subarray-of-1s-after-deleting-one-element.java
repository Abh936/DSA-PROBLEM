class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, zeroes = 0, maxlen = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] == 0) zeroes++;

            while (zeroes > 1) {
                if (nums[i] == 0) zeroes--;
                i++;
            }

            // length after deleting 1 zero → total window size - 1
            maxlen = Math.max(maxlen, j - i);
        }

        return maxlen;
    }
}
