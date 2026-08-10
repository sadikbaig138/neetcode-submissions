class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int n = word1.length() < word2.length() ? word1.length() : word2.length();
        for (int i = 0; i < n; i++) {
            str.append(word1.charAt(i) + "");
            str.append(word2.charAt(i) + "");
        }
        if (word1.length() > word2.length())
            str.append(word1.substring(word2.length(), word1.length()));
        else
            str.append(word2.substring(word1.length(), word2.length()));

        return str.toString();
    }
}