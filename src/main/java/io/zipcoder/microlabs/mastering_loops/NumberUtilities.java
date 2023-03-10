package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
         StringBuilder result = new StringBuilder();
            for (int i = start; i <= stop; i++) {
                if (i % 2 == 0) {
                    result.append(i).append("");
                }
            }
            return result.toString().trim();
        }





    public static String getOddNumbers(int start, int stop) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= stop; i++) {
            if (i % 2 != 0) {
                result.append(i).append("");
            }
        }
        return result.toString().trim();
    }



    public static String getSquareNumbers(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i += step) {
            result += i * i;
            }
            return result;
        }




    public static String getRange(int start) {

        return getExponentiations(start,0, 0,1);
    }

    public static String getRange(int start, int stop) {
        return getExponentiations(start,stop, 0, 1);
    }


    public static String getRange(int start, int stop, int step) {
        return getExponentiations(start,stop,step,1);
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        for (int i = start; i< stop; i+= step){
            result += (int)Math.pow(i,exponent);

        }return result;
    }
}
