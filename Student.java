package test1;
public class Student extends Person
{
    final String fresh = "freshman";
    final String sopho = "sophomore";
    final String jun = "junior";
    final String sen = "senior";
    private String status;
    public Student(String name)
    {
        super.setName(name);
    }
    public void setStatus(String Status)
   {
       status=Status;
   }
   public String getStatus()
   {
       if(status == "freshman")
           return fresh;
       else if(status == "sophomore")
           return sopho;
       else if(status == "junior")
           return jun;
       else if(status == "senior")
           return sen;
       else
           return "please enter "+ fresh + " or " + sopho + " or "+ jun+" or "+sen;
   }
    public String toString()
    {
        return "Class Name: " + this.getClass().getSimpleName()+"\nStudent Name: "+getName()+"\n";
    }
}
