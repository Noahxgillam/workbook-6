public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Person otherp) {
        return this.lastName.compareTo(otherp.lastName);
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + ")";
    }
}
