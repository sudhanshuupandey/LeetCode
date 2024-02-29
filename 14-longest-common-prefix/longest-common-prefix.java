class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String st1,st2;
        st1=strs[0];
        st2=strs[n-1];
        for(int i=0;i<Math.min(st1.length(),st2.length());i++){
            if(st1.charAt(i) != st2.charAt(i)){
                return ans.toString();
            }
            ans.append(st1.charAt(i));
        }
        return ans.toString();
    }
}