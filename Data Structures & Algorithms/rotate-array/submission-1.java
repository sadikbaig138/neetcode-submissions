class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length-1;
        k=  k % nums.length;
        nums=reverse(nums,0,n);
        nums=reverse(nums,0,k-1);
        nums=reverse(nums,k,n);   
    }

    public static int[] reverse(int[] nums,int i,int j){
        System.out.println("");
        while(i<j){
            var temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<nums.length;k++){
            System.out.println(nums[k]);
        }
        return nums;
    }
}