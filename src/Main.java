import java.util.ArrayList;
import java.util.Scanner;

/**
 * Extra features
 * 1) Catching errors (type errors, dividing by zero, gpa not in range)
 * 2) Creating new files for repeating functions - MathUtils.round() and MonsterCreation.create()
 * 3) Using dynamic array to store pointers to created monster object
 * 4)
 * 5)
 */
public class Main {
    public static void main(String[] args) {
        //new scanner object
        Scanner input = new Scanner(System.in);
        //variable to store how many monster are created
        int monsterCount;
        //variable that receives the type of monster from user
        int monsterType;
        //dynamic array that stores every monster class
        ArrayList<Monster> monsterArrayList = new ArrayList<>();

        //initialize the three default monsters
        monsterArrayList.add(new Monster());
        monsterArrayList.add(new Monster("Kiza", 200));
        monsterArrayList.add(new Monster("", "", 0, false, 0));

        //loop to create however many monster the user wishes
        while (true) {
            //clarify parameters
            System.out.println("\nEnter your desired monster type:\n1 for custom type,name,age,breath smell and gross point average\n2 for custom name and age\n0 to exit creation\nall other integers for a default monster");
            //receive the type of monster
            monsterType = CaseCatcher.typeErrorInt("", "The type of monster has to be a integer\nEnter your desired monster type:\n1 for custom type,name,age,breath smell and gross point average\n2 for custom name and age\n0 to exit creation\nall other integers for a default monster");

            //if input is zero, break the loop, else use the function created in MonsterModification.java
            if (monsterType == 0) {
                break;
            } else {
                monsterArrayList.add(MonsterModification.create(monsterType));
            }
        }
        //update the total monster count after creation
        monsterCount = monsterArrayList.size();

        //Prints out all the stats
        for (int i = 0; i < monsterCount; i++) {
            System.out.println("\nMonster " + (i + 1) + "\n=======");
            System.out.println(monsterArrayList.get(i));
        }
        /*
        double percentEvil = monsterTest.percentEvil();
        System.out.println("Monster's evil percentage: " + percentEvil);*/
    }
}