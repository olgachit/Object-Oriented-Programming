public class Person implements Comparable<Person> {
    private String name;
    private int age;

    // Constructor and other methods here
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age; // Compare persons based on age
    }
}