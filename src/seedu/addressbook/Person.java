package seedu.addressbook;

public class Person implements Comparable<Person> {
    private String name;
    private String phone;
    private String email;

    public Person(String name, String phone, String email) {
        this.name= name;
        this.phone= phone;
        this.email= email;
    }

    public String getName() {return name;}
    public String getPhone() {return phone;}
    public String getEmail() {return email;}

    @Override
    public int compareTo(Person other) {
        if(!this.getName().equals(other.getName())) {
            return this.getName().toLowerCase().compareTo(other.getName().toLowerCase());
        }
        else if(!this.getPhone().equals(other.getPhone())) {
            return this.getPhone().compareTo(other.getPhone());
        }
        else
            return this.getEmail().toLowerCase().compareTo(other.getEmail().toLowerCase());
    }
}
