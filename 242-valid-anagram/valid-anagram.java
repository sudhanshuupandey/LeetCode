class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> mp = new HashMap<>();
        for(char x:s.toCharArray()){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }for(char x:t.toCharArray()){
            mp.put(x,mp.getOrDefault(x,0)-1);
        }for(int k:mp.values()){
            if(k!=0){
                return false;
            }
        }
        return true;
    }
}