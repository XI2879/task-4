package Task_4;

public class MainVoter {
    public static void main(String[] args) {

        try {
            Voter vote = new Voter(12, "nagaraj", 17);
        } catch (InvalidAgeForVoter e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
