interface Interface
{
    public void method1();
    public void method2();
}
class Demo implements Interface {
    @Override
    public void method1() {
        System.out.println("Method 1 Implementation");
    }
    public void method2()
    {
        System.out.println("Method 2 implementation");
    }
    public static void main(String arg[])
    {
        Interface obj = new Demo();
        obj.method1();
    }
}
