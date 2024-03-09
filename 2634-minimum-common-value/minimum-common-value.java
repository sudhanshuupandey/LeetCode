class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n = nums1.length;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length && nums2[j]<=nums1[n-1];j++){
                if(nums1[i]==nums2[j]){
                    int common = nums1[i];
                    return common;
                }
            }
        }
        return -1;
    }
}