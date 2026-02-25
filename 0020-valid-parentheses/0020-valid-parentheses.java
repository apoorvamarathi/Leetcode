class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                //IF stack empty->invalid
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();

                //check matching
                if(ch == ')' && top != '(') return false;
                if(ch == '}' && top != '{' ) return false;
                if(ch == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}