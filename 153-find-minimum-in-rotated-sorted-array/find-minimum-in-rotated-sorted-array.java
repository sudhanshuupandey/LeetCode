class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums.length == 0) return 0;
            if(nums.length == 1) return nums[start];
            if(mid>0 && nums[mid] < nums[mid-1]){
                return nums[mid];
            }if(nums[start] <= nums[mid] && nums[mid]>nums[end]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return nums[start];
    }
}