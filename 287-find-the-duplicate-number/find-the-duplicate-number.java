class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while (i<nums.length){
            if(nums[i]!=i+1){
                int correctIndex=nums[i]-1;
                if(nums[i]!=nums[correctIndex]){
                    int temp = nums[correctIndex];
                    nums[correctIndex]=nums[i];
                    nums[i]=temp;
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
}