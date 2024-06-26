package Basic_Sorting;
// Time complexity O(n)

public class BubbleSort {
    public static void bubbleSort(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            int swapcount = 0;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    // swap
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    swapcount++;

                }
            }
            // If no swaps were made, the array is already sorted
            if (swapcount == 0)
                break;
        }
    }

    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };
        bubbleSort(nums);
        printArray(nums);
    }
}
