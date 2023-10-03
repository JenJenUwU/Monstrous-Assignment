import java.util.ArrayList;

/**
 * Extra features
 * 1) Using user input for monster creation and modification
 * 2) Catching errors (type error, dividing by zero, gpa not in range)
 * 3) Creating new static classes for repeating functions - MathUtils.round(), MonsterModification.create(), MonsterModification.method(), and all the CaseCatcher methods
 * 4) Addition of purse variable to purchase spa and sell monster
 * 5) Using dynamic array to store pointers to created monster object
 */
public class Main {
    public static void main(String[] args) {
        //variable to store how many monster are created
        int monsterCount;
        //variable that receives the type of monster from user
        int monsterType;
        //variable that stores the users current purse
        double purse = 500.0;
        //dynamic array that stores every monster class
        ArrayList<Monster> monsterArrayList = new ArrayList<>();

        //initialize the three default monsters
        monsterArrayList.add(new Monster());
        monsterArrayList.add(new Monster("KIZA", 200));
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
        //Modifying the default "" monster
        System.out.println("\nLets modify the default monster without type, name, age, breath smell and gross point average");
        MonsterModification.method(4, monsterArrayList.get(2));
        MonsterModification.method(5, monsterArrayList.get(2));
        MonsterModification.method(6, monsterArrayList.get(2));
        MonsterModification.method(7, monsterArrayList.get(2));
        MonsterModification.method(8, monsterArrayList.get(2));

        //loop to modify however many monster the user wishes
        while (true) {
            System.out.println("\nWhich monster would you like to modify? (Enter the number, 0 if none)");
            for (int i = 0; i < monsterCount; i++) {
                System.out.println((i + 1) + ") " + monsterArrayList.get(i).getmName());
            }
            //to save memory, using monsterType to store the index of monster being modified
            monsterType = CaseCatcher.typeErrorInt("", "The index of monster has to be an integer\nWhich monster would you like to modify? (Enter the number, 0 if none)");
            //if the user input is zero, break the loop
            if (monsterType == 0) {
                break;
            } else if (monsterType > monsterCount) {
                System.out.println("There are only " + monsterCount + " monsters");
            } else {
                //receive the type of modification
                int monsterModification = CaseCatcher.typeErrorInt("\nWhat would you like to do with " + monsterArrayList.get(monsterType - 1).getmName() + " ?\n1 for time warp\n2 for spa day\n3 for percent evil\n4 for name change\n5 for type change\n6 for age change\n7 for bad breath change\n8 for gross point average change\n9 to sell the monster\n0 to exit modification", "The type of modification has to be a integer");
                //if input is 0 break the loop
                //if the method requires a return statement (spa[2] and selling monster [9]) call balModify that returns the new purse
                //else call the void methods
                if (monsterModification == 0) {
                    break;
                } else if (monsterModification == 9 || monsterModification == 2) {
                    //modify the purse base on the modification
                    purse = MonsterModification.balModify(monsterModification, monsterArrayList.get(monsterType - 1), purse);
                    if (monsterModification == 9) {
                        //if monster is being sold, remove it from the arraylist
                        monsterArrayList.remove(monsterType - 1);
                        monsterCount -= 1;
                    }
                } else {
                    MonsterModification.method(monsterModification, monsterArrayList.get(monsterType - 1));
                }
            }
        }
    }
}