class Main
{
   public static void main (String s[])
   {
     int x=10;
     int y= --x + x++ + ++x + --x + x++;
     System.out.println(y);
     int z= x++ + ++x + ++x + x++ + ++x;
     System.out.println(z);
     int a= --x + --x +--x +--x;
     System.out.println(a);
   }
}