class Searching {

    // Making this method as static because i dont want to create the obj of it
    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Making this method as static because i dont want to create the obj of it
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Main method
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int target = 1;

        int result = linearSearch(nums, target);
        if (result != -1)
            System.out.println("Element is found at Index Position: " + result);
        else
            System.out.println("Element not found!");

        int result2 = binarySearch(nums, target);
        if (result2 != -1)
            System.out.println("Element is found at Index Position: " + result2);
        else
            System.out.println("Element not found!");
    }
}