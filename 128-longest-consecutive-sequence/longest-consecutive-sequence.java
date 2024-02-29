class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int longcon=0;
        int currseq=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
            if(nums[i] == nums[i-1]+1){
                currseq++;
            }else{
                longcon = Math.max(longcon,currseq);
                currseq = 1;
            }
        }
        }
        return Math.max(longcon,currseq);
    }
}