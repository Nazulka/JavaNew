package week9;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private String email;
    private List<String> hobbies;
    private Address address;

    public Person() {}  // Required for deserialization

    public Person(String name, int age, String email, List<String> hobbies, Address address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.hobbies = hobbies;
        this.address = address;
    }

    // Getters and Setters - Jackson uses these
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<String> getHobbies() { return hobbies; }
    public void setHobbies(List<String> hobbies) { this.hobbies = hobbies; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
}
