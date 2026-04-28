import java.util.Arrays;

class Plus_one {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        Plus_one obj = new Plus_one();
        System.out.println(Arrays.toString(obj.plusOne(arr)));
    }
}