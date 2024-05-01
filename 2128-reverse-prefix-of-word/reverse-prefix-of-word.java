class Solution {
    public String reversePrefix(String word, char ch) {
        char[] answer = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                int j = 0; 
                while (j < i) {
                    swapChars(answer, j++, i--);
                }
                return new String(answer);
            }
        }
        return word;
    }
    private void swapChars(char[] answer, int index1, int index2) {
        char temp = answer[index2];
        answer[index2] = answer[index1];
        answer[index1] = temp;
    }
}