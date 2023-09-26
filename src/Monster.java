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
        mGPA = //0.0 to 4.0;
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
        mGPA = grossPointAverage;
    }
}
