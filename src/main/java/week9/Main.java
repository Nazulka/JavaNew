package week9;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Create a list of people
            List<Person> people = Arrays.asList(
                    new Person(
                            "Alice", 30, "alice@example.com",
                            List.of("Reading", "Hiking"),
                            new Address("123 Maple St", "Springfield", "12345")
                    ),
                    new Person(
                            "Bob", 25, "bob@example.com",
                            List.of("Gaming", "Cooking"),
                            new Address("456 Oak Ave", "Shelbyville", "54321")
                    ),
                    new Person(
                            "Charlie", 40, "charlie@example.com",
                            List.of("Cycling"),
                            new Address("789 Pine Rd", "Ogdenville", "67890")
                    )
            );

            // Serialize list of people to JSON string
            String json = mapper.writeValueAsString(people);
            System.out.println("Serialized JSON:\n" + json);

            // Deserialize JSON string back to List<Person>
            List<Person> deserializedPeople = mapper.readValue(json, new TypeReference<List<Person>>() {});
            System.out.println("\nDeserialized People:");
            for (Person p : deserializedPeople) {
                System.out.println(p.getName() + " from " + p.getAddress().getCity() + ", hobbies: " + p.getHobbies());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
