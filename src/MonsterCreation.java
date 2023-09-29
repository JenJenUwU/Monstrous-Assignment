import java.util.Scanner;

public class MonsterCreation {
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
            //initialize variable so code would compile
            int monsterAge = 0;
            boolean monsterBreath = true;
            double monsterGPA = 0;

            System.out.println("Please enter the type of your monster: ");
            String monsterType = input.nextLine();
            System.out.println("Please enter the name of your monster: ");
            String monsterName = input.nextLine();
            //loop to ensure no type error occurs
            while (true) {
                System.out.println("Please enter then age of your monster: ");
                try {
                    monsterAge = input.nextInt();
                    //break loop if no error occurs
                    break;
                } catch (Exception e) {
                    //if catches an error, state the condition to the user
                    System.out.println("Age has to be a string");
                    //clears buffer
                    input.next();
                }
            }
            //loop to ensure no type error occurs
            while (true) {
                System.out.println("Does your monster have bad breath? ");
                try {
                    monsterBreath = input.nextBoolean();
                    //break loop if no error occurs
                    break;
                } catch (Exception e) {
                    //if catches an error, state the condition to the user
                    System.out.println("Option of bad breath has to be a boolean");
                    //clears buffer
                    input.next();
                }
            }
            //loop until the gpa input is in between 0.0 and 4.0
            while (true) {
                System.out.println("Please enter the gross point average of your monster: ");
                //loop to ensure no type error occurs
                while (true) {
                    try {
                        monsterGPA = input.nextDouble();
                        //break loop if no error occurs
                        break;
                    } catch (Exception e) {
                        //if catches an error, state the condition to the user
                        System.out.println("gross point average has to be a number");
                        System.out.println("Please enter the gross point average of your monster: ");
                        //clears buffer
                        input.next();
                    }
                }
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
            //initialize variable so code would compile
            int monsterAge = 0;

            System.out.println("Please enter the name of your monster: ");
            String monsterName = input.nextLine();
            //loop to ensure no type error occurs
            while (true) {
                System.out.println("Please enter then age of your monster: ");
                try {
                    monsterAge = input.nextInt();
                    //break loop if no error occurs
                    break;
                } catch (Exception e) {
                    //if catches an error, state the condition to the user
                    System.out.println("Age has to be a string");
                    //clears buffer
                    input.next();
                }
            }
            //clear buffer
            input.nextLine();
            return new Monster(monsterName, monsterAge);
        }
        //if type is not 1 or 2, returns a default class
        return new Monster();
    }
}
