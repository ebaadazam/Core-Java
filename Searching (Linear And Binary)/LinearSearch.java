public class LinearSreach {

    public static void linearSearch(int[] nums, int target) {
        int i;
        boolean found = false;
        for (i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at Index position " + i);
        }

    }

    public static void main(String[] args) {
        int[] nums = { 12, 5, 8, 10, 4 };
        int target = 8;

        linearSearch(nums, target);
    }
}

