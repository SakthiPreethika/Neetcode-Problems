class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int freq[]=new int[128];
        for(char c: t.toCharArray()){
            freq[c]++;
        }
        int count=t.length();
        int left=0;
        int minLen=Integer.MAX_VALUE;
        int start=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch]>0){
                count--;
            }
            freq[ch]--;
            while(count==0){
                if((i-left+1)<minLen){
                    minLen=i-left+1;
                    start=left;
                }
                 char leftchar=s.charAt(left);
                freq[leftchar]++;
                if(freq[leftchar]>0){
                     count++;

                }
                left++;
               
            }
        }
        if(minLen==Integer.MAX_VALUE){
            return "";
        }
        else{
            return s.substring(start,start+minLen);
        }
        
    }
}
