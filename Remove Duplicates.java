public class remove_dups{
    
    public static void main(String[] args){
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        int k = removeDuplicates(nums);

        System.out.print("Modified Array: [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
