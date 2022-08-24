import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int r = nums.length - 1;
        while (r >= 1 && nums[r] <= nums[r-1]) r--;
        if(r != 0) {
            int i = r - 1;
            int j = r;
            while (j < nums.length - 1 && nums[j + 1] > nums[i]) j++;
            swap(nums, i, j);
        }
        reverse(nums, r, nums.length-1);
    }
    private void swap(int[] nums, int l, int r) {
        int t = nums[l];
        nums[l] = nums[r];
        nums[r] = t;
    }
    private void reverse(int[] nums, int l, int r) {
        while(l<r) {
            swap(nums,l,r);
            l++;
            r--;
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,6,5,5,5,5,5,3,2,1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 15; i++) {
            new Solution().nextPermutation(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}