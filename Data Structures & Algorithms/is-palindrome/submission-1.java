class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(char c:s.toCharArray()){
            char a=Character.toLowerCase(c);
            if(Character.isLetterOrDigit(a)){
                str+=a;
            }

        }
        int left=0,right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}
