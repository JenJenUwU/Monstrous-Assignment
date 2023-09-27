import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the type of your monster: ");
        String monsterType = input.nextLine();
        System.out.println("Please enter the name of your monster: ");
        String monsterName = input.nextLine();
        System.out.println("Please enter then age of your monster: ");
        int monsterAge = input.nextInt();
        System.out.println("Does your monster have bad breath? ");
        boolean monsterBreath = input.nextBoolean();
        System.out.println("Please enter the gross point average of your monster: ");
        double monsterGPA = input.nextDouble();
        //clear buffer
        input.nextLine();

        Monster monsterTest = new Monster(monsterType, monsterName, monsterAge, monsterBreath, monsterGPA);
        System.out.println(monsterTest);
    }
}