class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if(nums1[0] > nums2[m-1] || nums2[0] > nums1[n-1]) return -1;
        int i=0,j=0;
        while(i<n && j<m){
            if(nums1[i] == nums2[j]) return nums1[i];
            if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        return -1;
    }
}