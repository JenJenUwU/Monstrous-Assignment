import java.util.Scanner;

public class MonsterModification {
    /**
     * Function that creates different type of monster with respective user inputs base on the type parameter
     *
     * @param type which type of monster to create
     * @return pointer to the monster object
     */
    public static Monster create(int type) {
        //create new scanner object
        Scanner input = new Scanner(System.in);

        if (type == 1) {
            //initialize variable
            int monsterAge;
            boolean monsterBreath;
            double monsterGPA;

            System.out.println("Please enter the type of your monster: ");
            String monsterType = input.nextLine();
            System.out.println("Please enter the name of your monster: ");
            String monsterName = input.nextLine();
            monsterAge = CaseCatcher.typeErrorInt("Please enter then age of your monster: ", "Age has to be a string");
            monsterBreath = CaseCatcher.typeErrorBoolean("Does your monster have bad breath? ", "Option of bad breath has to be a either true or false");
            //loop until the gpa input is in between 0.0 and 4.0
            while (true) {
                System.out.println("Please enter the gross point average of your monster: ");

                monsterGPA = CaseCatcher.typeErrorDouble("", "Gross point average has to be a number\nPlease enter the gross point average of your monster: ");
                if (monsterGPA > 4.0) {
                    //if the monsterGPA is greater than 4 announce it to user
                    System.out.println("The gross point average has to be below 4.0");
                } else if (monsterGPA < 0.0) {
                    //if the monsterGPA is greater than 4 announce it to user
                    System.out.println("The gross point average has to be above 0.0");
                } else {
                    break;
                }
            }
            //clear buffer
            input.nextLine();

            return new Monster(monsterType, monsterName, monsterAge, monsterBreath, monsterGPA);
        } else if (type == 2) {
            //initialize variable
            int monsterAge;

            System.out.println("Please enter the name of your monster: ");
            String monsterName = input.nextLine();
            monsterAge = CaseCatcher.typeErrorInt("Please enter then age of your monster: ", "Age has to be a string");
            //clear buffer
            input.nextLine();

            return new Monster(monsterName, monsterAge);
        }
        //if type is not 1 or 2, returns a default class
        return new Monster();
    }

    /**
     * Calling different methods on the monster
     *
     * @param type    type of modification
     * @param monster pointer to the monster object
     */
    public static void modify(int type, Monster monster) {
        //create new scanner object
        Scanner input = new Scanner(System.in);

        //Calling time warp
        if (type == 1) {
            int timeWarpVar;
            timeWarpVar = CaseCatcher.typeErrorInt("Please years your monster is time warping: ", "Year has to be a integer");
            monster.timeWarp(timeWarpVar);
        }

    }
}
