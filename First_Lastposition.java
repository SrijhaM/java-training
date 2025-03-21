class First_Lastposition
{
    public int[] searchRange(int[] nums, int target) 
    {
        int[] result = new int[2];
        result[0] = firstposition(nums,target);
        result[1] = lastposition(nums,target);
        return result;
    }
    private int firstposition(int[] nums,int target)
    {
        int index = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid]>=target)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
            if(nums[mid]==target)index = mid;
        }
        return index;
    }
    private int lastposition(int[] nums,int target)
    {
        int index = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid]<=target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
            if(nums[mid]==target)index = mid;
        }
        return index;
    }
    public static void main(String args[])
    {
        First_Lastposition obj = new First_Lastposition();
        int[] nums = {5,7,8,8,10};
        int target = 8;
        int[] result = obj.searchRange(nums,target);
        System.out.print("[" +result[0]+ "," +result[1]+ "]");
    }
}