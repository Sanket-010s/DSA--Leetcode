public class SearchInRotatedSortArray {
    public int search(int[] nums, int target){
        int times = 0 ;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                times = i;
                break;
            }else{
                times = -1;
            }
        }
        return times;
    }

    public static void main(String[] args) {
        int []nums = {1,2,2,3,4,5};
        SearchInRotatedSortArray obj = new SearchInRotatedSortArray();
        System.out.println(obj.search(nums,4));
    }
}
