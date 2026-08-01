class Solution {
    public int[] sortArray(int[] nums) {
          if (nums == null || nums.length <= 1) {
            return nums;
        }

        int n = nums.length;
        for (int currSize = 1; currSize < n; currSize = 2 * currSize) {
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {
                int mid = Math.min(leftStart + currSize - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);
                merge(nums, leftStart, mid, rightEnd);
            }
        }
        return nums;
    }
      private static void merge(int[] nums, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            int[] leftArr = new int[n1];
            int[] rightArr = new int[n2];

            System.arraycopy(nums, left, leftArr, 0, n1);
            System.arraycopy(nums, mid + 1, rightArr, 0, n2);

            int i = 0, j = 0, k = left;
            
            while (i < n1 && j < n2) {
                if (leftArr[i] <= rightArr[j]) {
                    nums[k] = leftArr[i];
                    i++;
                } else {
                    nums[k] = rightArr[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                nums[k] = leftArr[i];
                i++;
                k++;
            }

            while (j < n2) {
                nums[k] = rightArr[j];
                j++;
                k++;
            }
        }
}