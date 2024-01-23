package Task_4;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating a valid student
            //Student validStudent = new Student(1, "John", 18, "Math");

            // Creating a student with invalid age
            // This will throw AgeNotWithinRangeException
             //Student invalidAgeStudent = new Student(2, "Alice", 22, "Physics");

            // Creating a student with invalid name
            // This will throw NameNotValidException
             Student invalidNameStudent = new Student(3, "Bob123", 20, "History");
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
