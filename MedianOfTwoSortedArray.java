class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Always binary search on smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0;
        int high = m;

        while (low <= high) {

            // Partition of nums1
            int cut1 = (low + high) / 2;

            // Partition of nums2
            int cut2 = (m + n + 1) / 2 - cut1;

            // Left elements
            int left1 = (cut1 == 0)
                    ? Integer.MIN_VALUE
                    : nums1[cut1 - 1];

            int left2 = (cut2 == 0)
                    ? Integer.MIN_VALUE
                    : nums2[cut2 - 1];

            // Right elements
            int right1 = (cut1 == m)
                    ? Integer.MAX_VALUE
                    : nums1[cut1];

            int right2 = (cut2 == n)
                    ? Integer.MAX_VALUE
                    : nums2[cut2];

            // Correct partition found
            if (left1 <= right2 && left2 <= right1) {

                // If total length is even
                if ((m + n) % 2 == 0) {

                    return (Math.max(left1, left2)
                            + Math.min(right1, right2)) / 2.0;
                }

                // If total length is odd
                else {
                    return Math.max(left1, left2);
                }
            }

            // Move left
            else if (left1 > right2) {
                high = cut1 - 1;
            }

            // Move right
            else {
                low = cut1 + 1;
            }
        }

        return 0.0;
    }

    public static void main(String []args){
     int []arr1 = {1,3};
     int []arr2 = {2};
        MedianOfTwoSortedArray obj = new MedianOfTwoSortedArray();
        System.out.println(obj.findMedianSortedArrays(arr1, arr2));
    }
}