package pl.bootcamp.java.bmi.backdoor;
import java.util.Scanner;

public class Gui {
    Scanner scanner = new Scanner(System.in);
    public String showMenu(){

        System.out.println("1. Calculate BMI");
        System.out.println("2. Remind BMI");
        System.out.println("3. Exit");

        return scanner.nextLine();
    }

    public String inputNickname(){
        System.out.println("Enter your nickname: ");

        return scanner.nextLine();
    }

    public int inputHeight(){
        System.out.println("Enter your height in cm");

        return scanner.nextInt();
    }

    public int inputWeight() {
        System.out.println("Enter your weight in kg");

        return scanner.nextInt();
    }
    public int inputPin() {
        System.out.println("Podaj swój pin");

        return scanner.nextInt();

    }
}
