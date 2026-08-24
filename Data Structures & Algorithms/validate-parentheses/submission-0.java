class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        boolean valid=true;
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    valid=false;
                    continue;

                }
                char top=st.peek();
                if(top=='{'&& c=='}'||
                       top=='(' && c==')'||
                       top=='[' && c==']'){
                        st.pop();
                }
                else{
                    valid=false;
                    break;
                }
            }
        }
        if(!st.isEmpty()){
            valid=false;
        }
        return valid;
        
    }
}
