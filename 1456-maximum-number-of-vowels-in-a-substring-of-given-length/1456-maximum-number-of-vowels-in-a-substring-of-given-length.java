class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int n = s.length();
        String vowel="aeiou";
        int maxCount = Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
            if(i<k){
                if(vowel.indexOf(s.charAt(i)) != -1){
                count++;
                }
            }else{
                if(vowel.indexOf(s.charAt(i-k)) != -1){
                    count--;
                }
                if(vowel.indexOf(s.charAt(i)) != -1){
                    count++;                    
                }                
            }
            if(count==k){
                    return count;
            }
            if(i>=k-1){
                 maxCount = Math.max(maxCount,count);
            }
            

        }
        return maxCount;
    }
}