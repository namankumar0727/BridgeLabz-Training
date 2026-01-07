import java.util.Scanner;

class Solution {

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // To avoid integer overflow
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {       
                return mid;
            } else if (nums[mid] < target) { 
                start = mid + 1;
            } else {                         
                end = mid - 1;
            }
        }
        return -1; // Target not found
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.search(nums, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }

        sc.close();
    }
}
