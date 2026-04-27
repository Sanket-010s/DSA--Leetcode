// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]

class Remove_Duplication_from_Array {
public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            if (++i != j) {         
                nums[i] = nums[j];
            }
        }
    }
    return i + 1;
}
}