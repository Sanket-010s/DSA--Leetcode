import java.util.Arrays;

class FirstLastPosition {
    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        int index = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                right = mid - 1; // search left side
            }

            else if (nums[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return index;
    }

    private int findLast(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        int index = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                left = mid + 1; // search right side
            }

            else if (nums[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return index;
    }




    public static void main(String[] args) {
        int[] nums = {};
        FirstLastPosition obj = new FirstLastPosition();
        // System.out.println(Arrays.toString(obj.searchRange(nums, 2)));
        System.out.println(nums.length);
    }
}
