package numberGame;

import java.util.Random;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("*============================================================================*");
        System.out.println("||                                                                          ||");
        System.out.println("||                      Hello, Welcome to the Number Game.                  ||");
        System.out.println("||      In this game, you have to guess the number between 1 and 100.       ||");
        System.out.println("||                                                                          ||");
        System.out.println("*============================================================================*");
        int choice = 0;
    	Scanner sc = new Scanner(System.in);
        while(choice != 2) {
        	System.out.println();
        	System.out.println("\t\t1.Play the Game.");
        	System.out.println("\t\t2.Exit");
        	System.out.print("Enter the choice : ");
        	choice = sc.nextInt();
        	sc.nextLine();
        	if(choice == 2) {
        		System.out.println("System exited successfully...!");
        		break;
        	}
        	int user_number = 0;
        	int count = 0;
        	int score = 120;
        	while(randomNumber!=user_number && count != 5) {	
        		count++;
        		score -= 20;
            	System.out.print("Enter your guess" +"(" + count + "/5) : " ); 
            	user_number = sc.nextInt();
            	
        		int diffrence = user_number - randomNumber;
        		if(diffrence == 0) {
        			System.out.println();
        			System.out.println("CONGRATS...! You guessed right number...\nYour Score is : " + score);
        			System.out.println();
        			break;
        		}
        		if(diffrence > 0) {
        			if(diffrence>25) {
        				System.out.println("Guess is Too High...");
        			}else if (diffrence <= 25 && diffrence > 15) {
        				System.out.println("Guess is Moderate High...");
        			} else {
						System.out.println("Guess is Little High...");
					}
        			
        		} else {
        			if(diffrence< (-25)) {
        				System.out.println("Guess is Too less...");
        			}else if (diffrence >= (-25) && diffrence < (-15)) {
        				System.out.println("Guess is Moderate less...");
        			} else {
						System.out.println("Guess is Little less...");
					}
        		}
        		if(count==5) {
            		System.out.println("You have exhausted the chance LIMIT...! \nPlay again...!");
            		System.out.println("The number was : "+randomNumber);
        		}
        		
        	}
        }
        
        sc.close();
	}
	

}
