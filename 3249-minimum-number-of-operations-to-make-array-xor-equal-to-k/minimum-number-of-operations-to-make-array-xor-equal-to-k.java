class Solution {
        public int minOperations(int[] A, int k) {
        for (int num : A)
            k = k ^ num;
        return Integer.bitCount(k);
    }
}