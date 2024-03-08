class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }else{
                mp.put(nums[i],1);
            }
        }
        int maxm = 0;
        for (int value : mp.values()) {
            maxm = Math.max(maxm, value);
        }
        int ans = 0;
        for (int value : mp.values()) {
            if (value == maxm) {
                ans += value;
            }
        }
        return ans;
    }
}