package test1;
public class Person 
{
   private String name;
   private String address;
   private String phone;
   private String email;
   public void setName(String Name)
   {
       name=Name;
   }
   public String getName()
   {
       return name;
   }
   public void setAddress(String Address)
   {
       address=Address;
   }
   public String getAddress()
   {
       return address;
   }
   public void setPhone(String Phone)
   {
       phone=Phone;
   }
   public String getPhone()
   {
       return phone;
   }
   public void setEmail(String Email)
   {
       email=Email;
   }
   public String getEmail()
   {
       return email;
   }
   public String toString()
   {
        return "Class Name: " + this.getClass().getSimpleName()+"\nPerson Name: " + getName()+"\n" ;
   }
}
