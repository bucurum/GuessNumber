import java.util.Random;
import java.util.Scanner;

public class GuessNumber
{
    public static void main(String[] args)
    {
       System.out.println("Welcome.... \n" +
                "press 1 to Easy Mode  \n" +
                "press 2 to Medium Mode \n" +
                "press 3 to Hard Mode \n" +
                "press 4 to exit ");

        Scanner scn = new Scanner(System.in);

        int choice = scn.nextInt();


        switch (choice)
        {
            case 1:
                System.out.println("Enter a number from 0 to 100, You have 15 tries");
                GuessNumber(15);
                break;
            case 2:
                System.out.println("Enter a number from 0 to 100, You have 10 tries");
                GuessNumber(10);
                break;
            case 3:
                System.out.println("Enter a number from 0 to 100, You have 5 tries");
                GuessNumber(5);
                break;
            case 4:
                System.out.println("Good Bye... ");
                return;
        }


    }
    public static void GuessNumber(int nbr)
    {
        int counter = 0;
        Random rand = new Random();
        Scanner scn = new Scanner(System.in);



        int number = rand.nextInt(100 - 0) + 0 ;
        int guess = scn.nextInt();

        if(guess == number)
        {
            if(counter == 0)
                System.out.println("Wowwww you hit the target with 1st try!!!! ");
        }

        int rmd = nbr;
        rmd--;
        while (guess != number)
        {
            if(counter < (nbr - 1))
            {
                if (0 > guess || guess > 100) {
                    System.out.println("Enter a number from 0 to 100, Try again ");
                    guess = scn.nextInt();
                    counter++;
                } else if (guess < number) {
                    System.out.println("Enter a bigger number \n" +
                            "----------------------------------");
                    guess = scn.nextInt();
                    rmd--;
                    System.out.println( "---------------------------------- \n" +
                            + rmd + " tries remained \n" +
                            "----------------------------------");
                    counter++;
                } else {
                    System.out.println("Enter a smaller number \n" +
                            "----------------------------------");
                    guess = scn.nextInt();
                    rmd--;
                    System.out.println( "---------------------------------- \n" +
                            + rmd + " tries remained \n" +
                            "----------------------------------");
                    counter++;
                }
            }else {
                System.out.println("Game Over");
                System.out.println("True Answer is "+ number);
                return;
            }
        }
        System.out.println("Congratulations, You won with " + (counter + 1) + " tries ");
    }


}
