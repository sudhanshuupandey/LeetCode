class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int maxi = Integer.MIN_VALUE;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int x:nums){
            mp.put(x, mp.getOrDefault(x,0)+1);
        }n=n/2;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()>n){
                return entry.getKey();
            }
        }
        return 0;
    }
}