import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("| Welcome to Guess Number Game                         |");
        System.out.println("| You will Be Asked To Guess A Number To Win The Game  |");
        System.out.println("| You Have Maximum 5 Attemp Limit                      |");
        System.out.println("--------------------------------------------------------");
        int mn = getRanNum(1, 100);

        for(int j=0; j<=4; j++){
            Scanner r = new Scanner(System.in);
            System.out.println("\nEnter A Guess Number Between 1 To 100");
            int yg = r.nextInt();

            if(yg == mn) {
                System.out.println("OOhhOO!, Your Number Is Correct. You Win The Game!");
                break;
            }
            else if(yg < mn){
                System.out.println("Your Guess Number Is Smaller.");
            }
            else if(yg > mn){
                System.out.println("Your Guess Number Is Greater.");
            }

            if(j >=4){
                System.out.println();
                System.out.println("Nope. The number I was thinking of was " +mn+ "!");
            }
        }

    }
    
    public static int getRanNum(int min, int max){
        Random rm = new Random();
        return rm.ints(min, max).findFirst().getAsInt();
    }
}
