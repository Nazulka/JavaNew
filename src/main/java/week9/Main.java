package week9;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Create a Person object
            Person person = new Person("Alice", 30);

            // Serialize: Java object to JSON string
            String json = mapper.writeValueAsString(person);
            System.out.println("Serialized JSON: " + json);

            // Deserialize: JSON string back to Java object
            Person person2 = mapper.readValue(json, Person.class);
            System.out.println("Deserialized Person name: " + person2.getName());
            System.out.println("Deserialized Person age: " + person2.getAge());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Person {
    private String name;
    private int age;

    // Default constructor needed for Jackson
    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
