class Solution {
    public boolean isValid(String s) {
        char[] m = s.toCharArray();
        Stack<Character> p = new Stack<>();

        if (m.length % 2 != 0) {
            return false;
        }

        for (int i = 0; i < m.length; i++) {

            if (m[i] == '(' || m[i] == '{' || m[i] == '[') {
                p.push(m[i]);
            } 
            else {
                if (p.isEmpty()) return false;

                if (m[i] == ')' && p.peek() == '(') {
                    p.pop();
                } 
                else if (m[i] == '}' && p.peek() == '{') {
                    p.pop();
                } 
                else if (m[i] == ']' && p.peek() == '[') {
                    p.pop();
                } 
                else {
                    return false; 
                }
            }
        }

        return p.isEmpty();
    }
}
