import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;
        int maxcount = 1;
        int majority = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1]){
                count++;
            } else {
                count = 1;
            }

            if(count > maxcount){
                maxcount = count;
                majority = nums[i];
            }
        }

        return majority; 
    }
}
