public class remove_elements{

    public static void main(String[] args) {
        remove_elements remover = new remove_elements();
        int[] nums = {3, 2, 2, 3, 4, 5, 6};
        int val = 3;

        int result = remover.removeElement(nums, val);

        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeElement(int[] nums, int val) {
            int counter = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    int temp = nums[i];
                    nums[i] = nums[counter];
                    nums[counter] = temp;

                    counter++;
                }
            }

            return counter;
    }
}
