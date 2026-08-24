class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                res+=Character.toLowerCase(c);
            }

        }
        return valid(res);
        
    }
    public static boolean valid(String res){
        int left=0;
        int right=res.length()-1;
        while(left<right){
            if(res.charAt(left)!=res.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
