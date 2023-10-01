public class MathUtils {
    /**
     * Static method to round a double value to a specified decimal place.
     *
     * @param value     The double value to be rounded.
     * @param precision The number of decimal places to round to.
     * @return The rounded double value.
     */
    public static double round(double value, int precision) {
        /* explanation of round function
            1) obtain the scale to keep the extra digits
               ex: round(1.23, 1) -> scale = 10^1 = 10
            2) scale up the input value by the scale variable
               ex: 1.23*10 = 12.3
            3) round to the nearest integer with Math.round()
               ex: Math.round(12.3) -> 12
            4) cast it to a new double
               ex: (double) 12 -> 12.0
            5) divide the new value by the scale to revert it to its original digits
               ex: 12.0/10 -> 1.2
         */
        //scale variable keeps track the digits being moved
        int scale = (int) Math.pow(10, precision);
        //after value*scale, value gets multiplied by the integer would be rounded
        //then, covert it back to its original digits
        return (double) Math.round(value * scale) / scale;
    }
}