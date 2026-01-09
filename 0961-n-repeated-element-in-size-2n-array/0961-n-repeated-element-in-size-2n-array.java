class Solution {
    public int repeatedNTimes(int[] nums) {
        int p = nums.length/2;
        Arrays.sort(nums);
        int output  = 0;
        if(nums[p-1]==nums[p]){
            output = nums[p-1];
        }
        else if(nums[p-1]==nums[0]){
            output = nums[p-1];
        }
        else if(nums[p]==nums[nums.length-1]){
            output = nums[p];
        }
        return output;
        

        
    }
}