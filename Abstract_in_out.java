abstract class Sri
{
    abstract void disp();
    void display() 
    {
        System.out.println("Outer class");
    }
    static abstract class Inner
    {
        abstract void meth();
        void method(){
            System.out.println("Inner Class");
        }
    }
}
class X extends Sri.Inner
{
    public void meth()
    {
        System.out.println("Outer abstract");
    }
}
class Abstract_in_out
{
    public static void main(String args[]) 
    {
        X obj=new X();
        obj.method();
        obj.meth();
    }
}