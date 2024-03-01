class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int index = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                index=i;
                max=count;
            }
        }
        return new int[]{index,max};
    }
}