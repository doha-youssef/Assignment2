package test1;
public class Employee extends Person
{
    private String office;
    private double salary;
    private MyDate date;
    public void set_name(String name)
    {
        super.setName(name);
    }
    public void setOffice(String Office)
   {
       office = Office;
   }
   public String getOffice()
   {
       return office;
   }
   public void setSalary(double Salary)
   {
       salary = Salary;
   }
   public double getSalary()
   {
       return salary;
   }
   public void setDate(MyDate Date)
   {
       date = Date;
   }
   public MyDate getDate()
   {
       return date;
   }
    public String toString()
    {
       return "Class Name: "+this.getClass().getSimpleName()+"\nEmployee Name: "+getName()+"\n";
    }
}
