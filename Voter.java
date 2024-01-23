package Task_4;

class InvalidAgeForVoter extends Exception{
    public InvalidAgeForVoter(String message){
        super(message);
    }
}
public class Voter {
    private  int voterId;
    private  String name;
    private  int age;


    public Voter(int voterId, String name, int age) throws InvalidAgeForVoter {

        if(age<18){
            throw new InvalidAgeForVoter("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
