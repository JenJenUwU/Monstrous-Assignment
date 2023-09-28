import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int monsterCount;
        int monsterType;
        ArrayList<Monster> monsterArrayList = new ArrayList<>();

        while (true) {
            System.out.println("\nEnter your desired monster type:\n1 for custom type,name,age,breath smell and gross point average\n2 for custom name and age\n0 to exit creation\nall other integers for a default monster");
            monsterType = input.nextInt();
            if (monsterType == 0) {
                break;
            } else {
                monsterArrayList.add(MonsterCreation.create(monsterType));
            }
        }
        monsterCount = monsterArrayList.size();

        for (int i = 0; i < monsterCount; i++) {
            System.out.println(monsterArrayList.get(i));
        }
        /*
        double percentEvil = monsterTest.percentEvil();
        System.out.println("Monster's evil percentage: " + percentEvil);*/
    }
}