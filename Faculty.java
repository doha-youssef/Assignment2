package test1;
public class Faculty extends Employee
{
    private String office_hours;
    private String rank;
    public Faculty(String name)
    {
        super.setName(name);
    }
    public void setOfficeHours(String officeHours)
    {
        office_hours = officeHours;
    }
    public String getOfficeHours()
    {
        return office_hours;
    }
    public void setRank(String Rank)
    {
        rank = Rank;
    }
    public String getRank()
    {
        return rank;
    }
    public String toString()
    {
       return "Class Name: "+this.getClass().getSimpleName()+"\nFaculty Name: "+getName()+"\n";
    }
}
