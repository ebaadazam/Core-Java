public class MergeSort {

    public static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {

            // Find the middle value
            int mid = (left + right) / 2;

            // Recursively calling left and right part of the array
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);

            // Merging both the array after sorting
            merge(nums, left, mid, right);
        }
    }

    public static void merge(int[] nums, int left, int mid, int right) {
        // n1 and n2 are the sizes of leftArray() and rightArray()
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Creating two arrays
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        // Copying the values of both the arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = nums[left + i];
        }

        for (int i = 0; i < n2; i++) {
            rightArray[i] = nums[mid + 1 + i];
        }

        // Merging the arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k] = leftArray[i];
                i++;
            } else {
                nums[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Remaining Elements
        while (i < n1) {
            nums[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            nums[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 5, 3, 4, 1, 2 };

        System.out.println("Array Before Merge Sort");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Calling the mergeSort() method to sort the array
        mergeSort(nums, 0, nums.length - 1);

        System.out.println("Array After Merge Sort");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

}
