class Remove_element {
    public int removeElement(int[] nums, int val)
    {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Remove_element solution = new Remove_element();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = solution.removeElement(nums, val);
        System.out.println("Result: " + result);
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}  
