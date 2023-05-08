package programs;


public class ConstructorExample {
    
    public static void main(String[] args) {
        
        // Create an instance of the Person class using the no-argument constructor
        Person person1 = new Person();
        System.out.println("Person 1: " + person1);
        
        // Create an instance of the Person class using the parameterized constructor
        Person person2 = new Person("John", "Doe");
        System.out.println("Person 2: " + person2);
        
        // Create an instance of the Person class using the copy constructor
        Person person3 = new Person(person2);
        System.out.println("Person 3: " + person3);
        
    }
    
}

class Person {
    
    private String firstName;
    private String lastName;
    
    // No-argument constructor
    public Person() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
    }
    
    // Parameterized constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // Copy constructor
    public Person(Person otherPerson) {
        this.firstName = otherPerson.firstName;
        this.lastName = otherPerson.lastName;
    }
    
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    
}
