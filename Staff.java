package test1;
public class Staff extends Employee
{
    private String title;
    public Staff(String name)
    {
        super.setName(name);
    }
    public void setTitle(String Title)
    {
        title = Title;
    }
    public String getTitle()
    {
        return title;
    }
    public String toString()
    {
       return "Class Name: "+this.getClass().getSimpleName()+"\nStaff Name: "+getName()+"\n";
    }
}
