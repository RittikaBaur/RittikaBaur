public class employeeQ2
{
    String n;
    double sal,ans;
    void init(String name,double salary)
    {
        n=name;
        sal=salary;
    }
    void calc()
    {
        ans=50.0/100*sal+sal;
    }
    void display()
    {
        System.out.println("The name of the employee"+n);
        System.out.println("The salary of the employees is"+ans);
    }
    public static void main()
    {
        employeeQ2 obj=new employeeQ2();
        obj.init("RITTIKA",50000.0);
        obj.calc();
        obj.display();
    }
}
    