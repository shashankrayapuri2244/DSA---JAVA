class Solution {
    public boolean isPalindrome(String s) {
        int j=s.length();
        String a="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='0'&&s.charAt(i)<='9')){
                a+=s.charAt(i);
            }
        }

        int k=a.length()-1;
        a=a.toLowerCase();
        for(int i=0;i<a.length();i++){

            if(a.charAt(i) == a.charAt(k)){
                k--;
            }else{
                return false;
            }
            if(i==k){
                break;
            }

        }
        return true;
    }
}