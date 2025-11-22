class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int operation = 0;
        if (n == 0) return 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 3 == 0) {
                continue;
            }
            if (nums[i] % 3 == 1) {
               operation++;
            } else if (nums[i] % 3 == 2) {
                operation++;
            }
        }
        return operation;
    }
}
