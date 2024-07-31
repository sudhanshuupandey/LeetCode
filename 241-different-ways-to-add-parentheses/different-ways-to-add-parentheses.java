class Solution {
    public List<Integer> diffWaysToCompute(String e) {
        List<Integer> ans = new LinkedList<Integer>();
        for(int k=0;k<e.length();k++){
            if(e.charAt(k) == '+' || e.charAt(k) == '-' || e.charAt(k) == '*'){
                String left = e.substring(0,k);
                String right = e.substring(k+1);
                List<Integer> l = diffWaysToCompute(left);
                List<Integer> r = diffWaysToCompute(right);
                for(Integer i: l){
                    for(Integer j : r){
                        int c = 0;
                        switch(e.charAt(k)){
                            case '+': c=i+j;
                            break;
                            case '-': c=i-j;
                            break;
                            case '*': c=i*j;
                            break;
                        }
                        ans.add(c);
                    }
                }
            }
        }
        if(ans.size() == 0){
            ans.add(Integer.valueOf(e));
        }
        return ans;
    }
}