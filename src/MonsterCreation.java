import java.util.Scanner;

public class MonsterCreation {
    public static Monster create(int type) {
        Scanner input = new Scanner(System.in);
        if (type == 1) {
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
            return new Monster(monsterType, monsterName, monsterAge, monsterBreath, monsterGPA);
        } else if (type == 2) {
            System.out.println("Please enter the name of your monster: ");
            String monsterName = input.nextLine();
            System.out.println("Please enter then age of your monster: ");
            int monsterAge = input.nextInt();
            //clear buffer
            input.nextLine();
            return new Monster(monsterName, monsterAge);
        }
        return new Monster();
    }
}
