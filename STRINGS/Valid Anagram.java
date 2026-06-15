class Solution {
    public boolean isAnagram(String s, String t) {
        int f[] = new int[26];
        int n = s.length();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            f[c-'a']++;
        }
        for(int i=0;i<n;i++){
            char c = t.charAt(i);
            f[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(f[i]!=0){
                return false;
            }
        }
        return true;
    }
}