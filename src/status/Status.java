/*
 * Binita Shah
 * Student ID: 991549124
 * Midterm Exam
 */
package status;

import java.util.Scanner;

/**
 * This class takes String input from user and calls method statusDetail to
 * print the status of User-Rejected,Pending,Processing and Approved. if the
 * input is not given in String, program will accept and produce wrong results.
 * Use enumerators to avoid input errors and print the status details.
 *
 * 
 * modified by Binita
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CodeInput ci = new CodeInput();
        ci.codeMethod();
        System.out.println("The user status is as follows");
        for (StausUser stat : ci.intCode) {
            System.out.println(cod.getCod() + " " + stat.getStat());

        }
    }
}
