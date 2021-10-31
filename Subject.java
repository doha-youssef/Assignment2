package test2;
public class Subject
{
    String subjectID;
    String subjectName;
    int subjectHours;
    public Subject(String subjectID, String subjectName, int subjectHours)
    {
        this.subjectID=subjectID;
        this.subjectName=subjectName;
        this.subjectHours=subjectHours;
    }
    public String subInformation()
    {
        return "Subject ID: "+subjectID+"\nSubject Name: "+subjectName+"\nSubject Hours: "+subjectHours;
    }
}
