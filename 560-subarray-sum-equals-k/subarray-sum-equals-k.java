class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int pSum = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            pSum = pSum + nums[i];
            int r = pSum-k;
            count = count + mp.getOrDefault(r,0);
            mp.put(pSum,mp.getOrDefault(pSum,0)+1);
        }
        System.gc();
        return count;
    }
}