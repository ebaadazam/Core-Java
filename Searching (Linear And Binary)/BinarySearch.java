import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            else if (target > nums[mid]) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = { 12, 5, 8, 10, 4 };
        int target = 10;

        // Sort the array before performing binary search
        Arrays.sort(nums); // Now the array is sorted

        int result = binarySearch(nums, target);

        if (result != -1)
            System.out.println("Element found at Index Position " + result);
        else
            System.out.println("Element not found");
    }
}
