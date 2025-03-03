class College
{
    public int aicteid = 720722104;
    public void display()
    {
        System.out.println(aicteid);
    }
}
class dept extends College
{
    public int studentid = 170;
    public void disp()
    {
        System.out.println(studentid);
    }
}
class single_inher
{
    public static void main(String args[])
    {
        dept obj = new dept();
        obj.display();
        obj.disp();
    }
}