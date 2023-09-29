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
     * Getter method of mType
     *
     * @return mType
     */
    public String getmType() {
        return mType;
    }

    /**
     * Getter method of mName
     *
     * @return mName
     */
    public String getmName() {
        return mName;
    }

    /**
     * Getter method of mAge
     *
     * @return mAge
     */
    public int getmAge() {
        return mAge;
    }

    /**
     * Getter method of mBreath
     *
     * @return mBreath
     */
    public boolean getmBreath() {
        return mBreath;
    }

    /**
     * Getter method of mGPA
     *
     * @return mGPA
     */
    public double getmGPA() {
        return mGPA;
    }

    /**
     * Setter method of mType
     *
     * @param newType
     */
    public void setmType(String newType) {
        mType = newType;
    }

    /**
     * Setter method of mName
     *
     * @param newName
     */
    public void setmName(String newName) {
        mName = newName;
    }

    /**
     * Setter method of mAge
     *
     * @param newAge
     */
    public void setmAge(int newAge) {
        mAge = newAge;
    }

    /**
     * Setter method of mBreath
     *
     * @param newBreath
     */
    public void setmBreath(boolean newBreath) {
        mBreath = newBreath;
    }

    /**
     * Setter method of mGPA
     *
     * @param newGPA
     */
    public void setmGPA(double newGPA) {
        mGPA = newGPA;
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

    /**
     * Adjust the monster's age by the price of the spa, as well as half the gross point average and removing bad breath
     *
     * @param price price of the spa
     */
    public void spaDay(double price) {
        //if the price is higher than the current age, only set the age to 0
        if ((double) mAge > price) {
            mAge -= (int) (Math.floor(price));
        } else {
            mAge = 0;
        }
        //set the monster's stat of bad breath to false
        mBreath = false;
        //round the GPA after dividing it avoiding gpa going further than 1 decimal
        mGPA = MathUtils.round((mGPA / 2), 1);
    }

    /**
     * Method to obtain how evil the monster is
     *
     * @return the percentage evil of the monster [(index of a + 1)/name length] in percentage
     */
    public double percentEvil() {
        //only run if the monster has name so dividing by 0 error doesn't occur
        if (mName != null) {
            /* explanation of returned value
                1) obtain the string value in all lower cased so capital A does not get ignored
                   ex: JAY -> jay
                2) receive the index of "a" and add 1 to it
                   ex: jay -> 1+1 = 2
                3) divide the double of index+1 by the double of the string length
                   ex: 2.0/3.0 -> 0.6667
                4) since its in decimal format, multiply the result by 100 to make it in percentage
                   ex: 0.6667 -> 66.67
                5) using the round function to round it to 1 decimal
                   ex: 66.67-> 66.7
             */
            return MathUtils.round(((double) (mName.toLowerCase().indexOf("a") + 1) / (double) mName.length() * 100), 1);
        } else {
            return 0;
        }
    }
}
