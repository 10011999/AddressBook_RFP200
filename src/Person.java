public class Person {
    String firstName;
    String lastName;
    String address;
    String city;
    String email;
    int zip;
    long phoneNumber;

    public Person(String firstName,String lastName,String address,String city,String email,int zip,long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

//    public void getDisplay(){
//        System.out.println(toString());
//    }
}
