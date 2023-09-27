
public class Monster {
    /**
     * Class Instance Variables
     */
    private String mType;
    private String mName;
    private int mAge;
    private boolean mBreath;
    private double mGPA;

    /**
     * Constructor w/ no parameters
     */
    public Monster() {
        mType = "Zombie";
        mName = "Uugggghhh";
        mAge = 0;
        mBreath = true;
        mGPA = 3.9;
    }

    /**
     * Constructor w/ name and age
     *
     * @param name Name of the monster object
     * @param age  Age of the monster object
     */
    public Monster(String name, int age) {
        mType = "Vampire";
        mName = name;
        mAge = age;
        mBreath = false;
        //Using
        mGPA = MathUtils.round((Math.random() * 4.0), 1);
    }

    /**
     * Constructor w/ type,name,age,confirmation of bad breath, and gross point average
     *
     * @param type              Type of the monster object
     * @param name              Name of the monster object
     * @param age               Age of the monster object
     * @param badBreath         Whether the monster object has bad breath or not
     * @param grossPointAverage How gross the monster object is
     */
    public Monster(String type, String name, int age, boolean badBreath, double grossPointAverage) {
        mType = type;
        mName = name;
        mAge = age;
        mBreath = badBreath;
        mGPA = MathUtils.round(grossPointAverage, 1);
    }

    /**
     * toString function that returns the stats of monster
     *
     * @return mName's stats:
     * Type: mType
     * Age: mAge
     * Gross point average: mGPA
     * Have bad breath? mBreath
     */
    public String toString() {
        return (mName + "'s stats:" + "\nType: " + mType + "\nAge: " + mAge + "\nGross point average: " + mGPA + "\nHave bad breath? " + mBreath);
    }

    public void timeWarp(int numberOfYears) {
        mAge += numberOfYears;
        /* explanation of mGPA += 0.1 * ((int) (Math.floor((double) numberOfYears / 100.0)));
            1) cast numberOfYears into a double and divide by 100.0
               ex: 123 -> 1.23
            2) floor the number into a lower value to avoid rounding errors
               ex: 1.23 -> 1.0
            3) convert the double into a int
               ex: 1.0 -> 1
         */
        mGPA += 0.1 * ((int) (Math.floor((double) numberOfYears / 100.0)));
    }

}
