
import java.util.Scanner;

/*
 *this template
 */

/**
 *
 * @author tmoti
 */
public class TestUserprofile {
     public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("Enter your favourite genres separated by a comma; Comedy, Drama, Action, Mystery ");
        String genres = input.nextLine();
        
        System.out.println("Your profile has now been created:" + name+":"  +  genres+"");
        
     }
}

