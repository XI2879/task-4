package Task_4;

import java.util.Scanner;


public class WeekDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};

        int n = scan.nextInt();
        try{

                System.out.println(arr[n]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: entered "+n+" please enter between 0 to 6");
        }
    }
}
