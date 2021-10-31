package test2;
public class Address 
{
    String streetNo;
    String city;
    String country;
    public Address(String streetNo, String city, String country)
    {
        this.streetNo=streetNo;
        this.city=city;
        this.country=country;
    }
    public String getAddress()
    {
        return "Address: "+streetNo+" "+city+" "+country;
    }
}
