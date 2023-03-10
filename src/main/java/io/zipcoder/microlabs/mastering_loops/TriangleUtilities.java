package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String s = "";
        for (int i=1; i< numberOfRows; i++ ){
            for (int j = 0; j< i; j++){
                s+="*";
            }
            s+= "\n";
        }
        return s;
    }

    public static String getRow(int numberOfStars) {
        String andre = "";
        for (int i=0; i<numberOfStars; i++){
            andre += "*";
        }


        return andre;
    }

    public static String getSmallTriangle() {
        return TriangleUtilities.getTriangle(5);
    }

    public static String getLargeTriangle() {
        return TriangleUtilities.getTriangle(10);
    }
}
