package LabTasks.RomanNumbers;

import static java.lang.String.join;
import static java.util.Collections.nCopies;

public class LatinNumbers {

    public static void main(String[] args) {
        System.out.println(intToRoman(100));
    }

    public static String intToRoman(int number) {
        // Code

        return join("", nCopies(number, "I"))
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");

    }

}
