class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        List<Integer> answer = new ArrayList<>();
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j< nums.length;j++){
            if(nums[j]!=j+1){
                answer.add(nums[j]);
            }
        }
        return answer;
    }
}