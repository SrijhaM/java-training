class Removedup
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 2, 3, 7, 8, 8};
        int[] temp = new int[arr.length];
        int newSize = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            boolean isDuplicate = false;
            for (int j = 0; j < newSize; j++) 
            {
                if (arr[i] == temp[j])
                {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[newSize] = arr[i];
                newSize++; 
            }
        }
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
