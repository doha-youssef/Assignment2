package test1;
public class Test1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Doha Ahmed");
        System.out.println(p.toString());
        Student std = new Student("Doha Ahmed");
        System.out.println(std.toString());
        Employee e = new Employee();
        e.setName("Doha Ahmed");
        System.out.println(e.toString());
        Faculty f = new Faculty("Doha Ahmed");
        System.out.println(f.toString());
        Staff s = new Staff("Doha Ahmed");
        System.out.println(s.toString());
    }
    
}
