class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0 ;
        
        for(int j = 0 ; j<nums.length ; j++){
            if(nums[j]%2 == 0){
                swap(nums,i,j);
                i++ ;
            }
        }
        
        return nums ;
    }
    
    public void swap(int[] arr , int e1 , int e2){
        int temp = arr[e1];
        arr[e1] = arr[e2];
        arr[e2] = temp ;
    }
}
