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
            monsterAge = CaseCatcher.typeErrorInt("Please enter then age of your monster: ", "Age has to be an integer");
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
            monsterAge = CaseCatcher.typeErrorInt("Please enter then age of your monster: ", "Age has to be an integer");
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
    public static void method(int type, Monster monster) {
        //create new scanner object
        Scanner input = new Scanner(System.in);

        //
        if (type == 1) {
            //initialize variable
            int yearsWarping;
            int oldAge = monster.getmAge();
            double oldGPA = monster.getmGPA();

            yearsWarping = CaseCatcher.typeErrorInt("Please enter the years " + monster.getmName() + " is time warping: ", "Year has to be a integer");
            monster.timeWarp(yearsWarping);
            System.out.println("\n" + monster.getmName() + " has went from " + oldAge + " to " + monster.getmAge() + " years old after time warping");
            System.out.println(monster.getmName() + "'s GPA has went from " + oldGPA + " to " + monster.getmGPA() + " after time warping");
        } else if (type == 2) {
            //initialize variable
            double spaCost;
            int oldAge = monster.getmAge();
            double oldGPA = monster.getmGPA();
            boolean oldBreath = monster.getmBreath();

            spaCost = CaseCatcher.typeErrorDouble("Please enter the cost of the spa " + monster.getmName() + " is having: ", "Cost hs to be a number");
            monster.spaDay(spaCost);
            System.out.println("\n" + monster.getmName() + " has went from " + oldAge + " to " + monster.getmAge() + " years old after the spa");
            System.out.println(monster.getmName() + "'s GPA has went from " + oldGPA + " to " + monster.getmGPA() + " after the spa");
            //if old breath is already false, do not print the change in old breath
            if (oldBreath) {
                System.out.println(monster.getmName() + "'s bad breath has vanished after the spa");
            }
        } else if (type == 3) {
            //initialize variable
            double evilPercent;

            evilPercent = monster.percentEvil();
            System.out.println("\n" + monster.getmName() + " is " + evilPercent + "% evil");
        } else if (type == 4) {
            //initialize variable
            String oldName = monster.getmName();
            String newName;

            System.out.println("Please enter the new name of " + oldName + ": ");
            newName = input.nextLine();
            monster.setmName(newName);
            System.out.println("\n" + oldName + "'s name has changed to " + monster.getmName());
        } else if (type == 5) {
            //initialize variable
            String oldType = monster.getmType();
            String newType;

            System.out.println("Please enter the new type of " + monster.getmName() + ": ");
            newType = input.nextLine();
            monster.setmType(newType);
            System.out.println("\n" + monster.getmName() + "'s type has changed from " + oldType + " to " + monster.getmType());
        } else if (type == 6) {
            //initialize variable
            int oldAge = monster.getmAge();
            int newAge;

            newAge = CaseCatcher.typeErrorInt("Please enter the new age of " + monster.getmName() + ": ", "Age has to be an integer");
            monster.setmAge(newAge);
            System.out.println("\n" + monster.getmName() + "'s age has changed from " + oldAge + " to " + monster.getmAge());
        } else if (type == 7) {
            //initialize variable
            boolean oldBreath = monster.getmBreath();
            boolean newBreath;

            newBreath = CaseCatcher.typeErrorBoolean("Please enter whether " + monster.getmName() + " has bad breath or not: ", "Option of bad breath has to be a either true or false");
            monster.setmBreath(newBreath);
            System.out.println("\n" + monster.getmName() + "'s bad breath has changed from " + oldBreath + " to " + monster.getmBreath());
        } else if (type == 8) {
            //initialize variable
            double oldGPA = monster.getmGPA();
            double newGPA;

            while (true) {
                System.out.println("Please enter the gross point average of " + monster.getmName() + ": ");

                newGPA = CaseCatcher.typeErrorDouble("", "Gross point average has to be a number\nPlease enter the gross point average of your monster: ");
                if (newGPA > 4.0) {
                    //if the monsterGPA is greater than 4 announce it to user
                    System.out.println("The gross point average has to be below 4.0");
                } else if (newGPA < 0.0) {
                    //if the monsterGPA is greater than 4 announce it to user
                    System.out.println("The gross point average has to be above 0.0");
                } else {
                    monster.setmGPA(newGPA);
                    System.out.println("\n" + monster.getmName() + "'s GPA has changed from " + oldGPA + " to " + newGPA);
                    break;
                }
            }
        }
    }
}
