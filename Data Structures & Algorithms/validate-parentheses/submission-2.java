class Solution {
    public boolean isValid(String s) {
        char a[]=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                a[++top]=c;
            }
            else{
                if(top==-1){
                    return false;
                }
                char open=a[top--];
                if(c==')' && open!='('
                ||c=='}' && open!='{'
                ||c==']' && open!='['){
                    return false;
                
                }
            }    

        }
        return top==-1;

        
        
    }
}

