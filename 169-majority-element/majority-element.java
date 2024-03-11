class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int counter = 0;
        int currE = 0;
        for(int i=0;i<n;i++){
            if(n==1) return nums[i];
            if(counter==0){
                counter++;
                currE = nums[i];
            }
            else if(currE == nums[i]) counter++;
            else counter--;
        }
        int counter1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == currE) counter1++;
        }
        if (counter1 > (n / 2)) return currE;
        return -1;
    }
}