class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        s=s.chars().mapToObj(c -> (char)c).sorted().map(String::valueOf).collect(Collectors.joining(","));
        t=t.chars().mapToObj(c -> (char)c).sorted().map(String::valueOf).collect(Collectors.joining(","));
        if(s.equals(t)){
            return true;
        }else{
            return false;
        }
    }
}
