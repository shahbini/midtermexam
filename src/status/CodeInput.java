/*
 * Binita Shah
 * Student ID: 991549124
 * Midterm Exam
 */
package status;

/**
 *
 * @author Binita
 */
public class CodeInput {

    public int CodesNum = 4;
    StausUser[] intCode = new StausUser[CodesNum];

    public void codeMethod() {
        int i = 0;
        for (StausUser.Code cod : StausUser.Code.values()) {
            for (StausUser.Status stat : StausUser.Status.values()) {
                intCode[i] = new StausUser(cod, stat);
                i++;
            }

        }
    }
}
