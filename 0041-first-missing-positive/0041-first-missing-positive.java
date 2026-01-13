class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        boolean present = true;
        int count = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){
                continue;
            }
            else if(nums[i]==count){
                present = true;
                count++; 

            }
            

        }
        return count;
    }
}