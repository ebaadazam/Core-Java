public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        int temp;
        boolean swapped;

        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 6, 3, 9, 2, 1, 5, 7 };

        System.out.println("Array before Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        bubbleSort(nums);

        System.out.println("Array after Sorting");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
