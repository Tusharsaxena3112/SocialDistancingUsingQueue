package driverPackage;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the essentials details to enter into the market" +'\n');
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Enter your mobile number: It must be in the form 91-XXXXXXXXXX");
        String mobNumber = scanner.nextLine().trim();
        System.out.println(mobNumber.matches("^91-[1-9][0-9]{9}$"));
        while(true){
            if(mobNumber.matches("^91-[1-9][0-9]{9}$")){
                break;
            }
            else{
                System.out.println("Enter your phone number again: your mob number should not start with 0");
            }
            mobNumber = scanner.nextLine();
        }
        System.out.println("Enter your gender in a single character:");
        char gender = scanner.next().charAt(0);
        System.out.println("Enter your city:");
        scanner.next();
        String city = scanner.nextLine();
        System.out.println("Whether you are infected or not: true or false as it is.");
        boolean isInfected = scanner.nextBoolean();
        System.out.println("Whether you are aware of infection");
        boolean isAwareOfInfection = scanner.nextBoolean();
        System.out.println("Whether aware of social distancing");
        boolean isAwareOfSocialDistancing=scanner.nextBoolean();
    }
}
