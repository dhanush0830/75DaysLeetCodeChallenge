class Solution {
    public boolean isSubsequence(String s, String t) {
        int read = 0;
        int visit = 0;

        while (read < s.length() && visit < t.length()) {
            if (s.charAt(read) == t.charAt(visit)) {
                read++;
            }
            visit++;
        }

        return read == s.length();
    }
}