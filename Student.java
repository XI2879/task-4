package Task_4;

// Custom Exception 1: AgeNotWithinRangeException
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom Exception 2: NameNotValidException
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}
public class Student {
    private int rollno;
    private String name;
    private int age;
    private String course;

    public Student(int rollno, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }

        if (!name.matches("^[a-zA-Z]+$")) {
            throw new NameNotValidException("Name should contain only alphabets.");
        }

        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

