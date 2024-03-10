class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp1 = new HashMap<>();
        Set<Integer> intersect = new HashSet<>();
        for(int x:nums1){
            mp1.put(x,mp1.getOrDefault(x,0)+1);
        }for(int y:nums2){
            if(mp1.containsKey(y)){
                intersect.add(y);
            }
        }
        int[] ans = new int[intersect.size()];
        int i=0;
        for(Integer x: intersect) ans[i++]=x;
        return ans;
    }
}