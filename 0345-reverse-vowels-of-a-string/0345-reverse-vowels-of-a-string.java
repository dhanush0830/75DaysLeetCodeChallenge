class Solution {
    public String reverseVowels(String s) {
        char[] res = s.toCharArray();
        int left = 0;
        String vowel = "aeiouAEIOU";
        int right = res.length - 1;
        while(left < right){
            if(vowel.indexOf(res[left]) == -1){
                left++;
            }else if(vowel.indexOf(res[right]) == -1){
                right--;
            }else{
                char temp = res[left];
                res[left]=res[right];
                res[right]=temp;
                left++;
                right--;
            }
        }
        return new String(res);
    }
}