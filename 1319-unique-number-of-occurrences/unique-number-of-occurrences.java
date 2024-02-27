class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int x: arr){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        Set<Integer> st= new HashSet<>();
        for(int x: mp.values()){
            st.add(x);
        }
        return mp.size()==st.size();
    }
}