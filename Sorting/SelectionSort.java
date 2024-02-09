public class SelectionSort {

    public static void selectionSort(int[] nums) {
        int temp;
        int minIndex = -1;

        for (int i = 0; i < nums.length - 1; i++) {

            minIndex = i;

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 6, 10, 3, 7, 9, 2, 1, 4 };

        System.out.println("Array before Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        selectionSort(nums);

        System.out.println("Array after Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

}
