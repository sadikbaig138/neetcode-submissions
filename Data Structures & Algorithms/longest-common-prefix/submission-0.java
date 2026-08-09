class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = Arrays.stream(strs).reduce((a, b) -> {
            int min = Math.min(a.length(), b.length());
            int index = 0;
            while (index < min && a.charAt(index) == b.charAt(index)) {
                index++;
            }
            return a.substring(0, index);
        }).orElse("");
        return longestCommonPrefix;
    }
}