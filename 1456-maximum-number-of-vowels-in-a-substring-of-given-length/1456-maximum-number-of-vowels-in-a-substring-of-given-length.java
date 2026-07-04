class Solution {
    public int maxVowels(String s, int k) {
        int n =s.length();
        int count=0;
        String vowel = "aeiou";
        for(int i = 0;i<k;i++){
            if(vowel.indexOf(s.charAt(i)) != -1)
            count++;
        }
        int maxCount = count;
        for(int i = k;i<n;i++ ){
            if(count == k){
                return count;
            }
            if (vowel.indexOf(s.charAt(i-k)) != -1){
                count--;
            }
            if (vowel.indexOf(s.charAt(i)) != -1){
                count++;
            }
            maxCount = Math.max(count , maxCount);
        }
        return maxCount;
    }
}