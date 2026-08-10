class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            var sum=numbers[l]+numbers[r];
            if(target==sum){
                return new int[] {1+l,1+r};
            }else if(sum>target){
                r--;
            }else if(sum<target){
                l++;
            }
        }
        return new int[2];
    }
}
