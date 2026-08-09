class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll(" ", "");
        int l = 0;
        int r = s.length() - 1;
        String regex = "[a-zA-Z0-9]";
        while (l < r) {
            if (!String.valueOf(s.charAt(r)).matches(regex)) {
                r--;
            } else if (!String.valueOf(s.charAt(l)).matches(regex)) {
                l++;
            }
            else if (String.valueOf(s.charAt(l)).equalsIgnoreCase(String.valueOf(s.charAt(r)))) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
