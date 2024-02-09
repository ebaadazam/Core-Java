public class QuickSort {
    public static void main(String[] args) {

        int[] nums = { 6, 20, 10, 7, 1, 4, 3 };

        quickSort(nums, 0, nums.length - 1);

        for (int n : nums) {
            System.out.print(n + " ");
        }

    }

    public static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int pivot = partition(nums, left, right);

            // Recursively calling both left and right parts
            quickSort(nums, left, pivot - 1);
            quickSort(nums, pivot + 1, right);
        }
    }

    private static int partition(int[] nums, int left, int right) {

        // Mark pivot as the last element
        int pivot = nums[right];

        // The position of i will be -1
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[right];
        nums[right] = temp;

        return i + 1;
    }
}
