import java.util.Scanner;

public class CaseCatcher {
    /**
     * Function that catches an error when calling input.nextInt()
     *
     * @param txt1 Text before calling the input
     * @param txt2 Text after an error occurs
     * @return the value of input
     */
    public static int typeErrorInt(String txt1, String txt2) {
        //new scanner object
        Scanner input = new Scanner(System.in);
        int returnValue;
        //loop to ensure no type error occurs
        while (true) {
            if (txt1 != null) {
                System.out.println(txt1);
            }
            try {
                returnValue = input.nextInt();
                //break loop if no error occurs
                break;
            } catch (Exception e) {
                //if catches an error, state the condition to the user
                if (txt2 != null) {
                    System.out.println(txt2);
                }
                //clears buffer
                input.next();
            }
        }
        return returnValue;
    }

    /**
     * Function that catches an error when calling input.nextDouble()
     *
     * @param txt1 Text before calling the input
     * @param txt2 Text after an error occurs
     * @return the value of input
     */
    public static double typeErrorDouble(String txt1, String txt2) {
        //new scanner object
        Scanner input = new Scanner(System.in);
        double returnValue;
        //loop to ensure no type error occurs
        while (true) {
            if (txt1 != null) {
                System.out.println(txt1);
            }
            try {
                returnValue = input.nextDouble();
                //break loop if no error occurs
                break;
            } catch (Exception e) {
                //if catches an error, state the condition to the user
                if (txt2 != null) {
                    System.out.println(txt2);
                }
                //clears buffer
                input.next();
            }
        }
        return returnValue;
    }

    /**
     * Function that catches an error when calling input.nextBoolean()
     *
     * @param txt1 Text before calling the input
     * @param txt2 Text after an error occurs
     * @return the value of input
     */
    public static boolean typeErrorBoolean(String txt1, String txt2) {
        //new scanner object
        Scanner input = new Scanner(System.in);
        boolean returnValue;
        //loop to ensure no type error occurs
        while (true) {
            if (txt1 != null) {
                System.out.println(txt1);
            }
            try {
                returnValue = input.nextBoolean();
                //break loop if no error occurs
                break;
            } catch (Exception e) {
                //if catches an error, state the condition to the user
                if (txt2 != null) {
                    System.out.println(txt2);
                }
                //clears buffer
                input.next();
            }
        }
        return returnValue;
    }
}
