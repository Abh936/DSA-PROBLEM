class Solution {
    public void reverseString(char[] str) {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length; i++){
            s.push(str[i]);
        }
        for(int i = 0; i < str.length; i++){
            str[i] = s.pop();
        }
    }
}
