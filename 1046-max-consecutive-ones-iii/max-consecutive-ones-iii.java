class Solution {
    public int longestOnes(int[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0;
        int maxlen = 0, zeroes = 0;

        while (j < n) {

            if (arr[j] == 0) {
                zeroes++;
            }

            // shrink window if zeroes exceed k
            while (zeroes > k) {
                if (arr[i] == 0) {
                    zeroes--;
                }
                i++;
            }

            maxlen = Math.max(maxlen, j - i + 1);
            j++;
        }

        return maxlen;
    }
}
