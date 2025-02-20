import java.util.Scanner;
class Studentclss
{
      String name;
      int regno;
      void info(String n, int r)
     {
         name = n;
         regno = r;
         System.out.println(name);
         System.out.println(regno);
     }
}   
  class Main
  {
          public static void main(String args[])
          {
              for(int i=1;i<=5;i++)
              {
              Studentclss s1 = new Studentclss();
              Scanner in = new Scanner(System.in);
              System.out.print("Enter Student"+i+ " Name:");
              String name = in.nextLine();
              System.out.print("Enter the regno:");
              int regno = in.nextInt();
              System.out.println("Name is " +name);
              System.out.println("Regno is " +regno);
              System.out.println();
              
              }
          }
}
  