package test2;
public class Test2 {
    public static void main(String[] args) 
    {
        Subject sub = new Subject("cs102", "Software Development",3);
        Address add = new Address("23 Al Aboor", "Maghagha", "Minya");
        Student std = new Student ("Doha", "83", "B+", sub, add);
        System.out.println(std.toString());
    }
    
}
