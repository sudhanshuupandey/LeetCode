class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 1;
        int n = nums.length;
        if(nums.length == 0) return 0;
        Set<Integer> st = new HashSet<>();
        for(int num:nums){
            st.add(num);
        }for(int it : st){
            if(!st.contains(it-1)){
                int x=it;
                int count = 1;
                while(st.contains(x+1)){
                    x++;
                    count++;
                }
                longest = Math.max(count,longest);
            }
        }
        return longest;
    }
}