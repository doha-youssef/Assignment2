package test2;
public class Student
{
    String name;
    private String ID;
    String GPA;
    Subject mySubject;
    Address myAddress;
    public Student(String name, String ID, String GPA, Subject mySubject, Address myAddress)
    {
        this.name=name;
        this.ID=ID;
        this.GPA=GPA;
        this.mySubject=mySubject;
        this.myAddress=myAddress;
    }
    public String toString()
    {
        return "Student Name: "+name+"\n"+"Student ID: "+ID+"\nStudent GPA: "+GPA+
                "\n"+mySubject.subInformation()+"\n"+myAddress.getAddress();
    }
}
