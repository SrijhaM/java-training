class length
 {
    public static int lengthOfLongestSubstring(String s)
    {
      int n = s.length();  
      int ans = 0;
      int[] index = new int[256];
      for (int i = 0, j = 0; j<n; j++)
      {
        i = Math.max(i,index[s.charAt(j)]);
        ans = Math.max(ans,j-i+1);
        index[s.charAt(j)] = j+1;
      }
      return ans;
    }
    public static void main(String args[])
    {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}