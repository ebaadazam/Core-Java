public class InsertionSort {

    public static void insertionSort(int[] nums) {

        int key;

        for (int i = 1; i < nums.length; i++) {

            key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }

        // Printing the elements
        System.out.println("Elements after applying insertion sort:");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 5, 6, 2, 3, 1, 7 };

        insertionSort(nums);
    }
}
