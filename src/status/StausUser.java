/*
 * Binita Shah
 * Student ID: 991549124
 * Midterm Exam
 */
package status;

/**
 *
 * 
 * modified by Binita
 */
public class StausUser {

    public enum Code {
        ZERO, ONE, TWO, THREE
    };
    private Code cod;

    public enum Status {
        REJECTED, PENDING, PROCESSING, APPROVED, NOT_VALID_CODE
    };
    private Status stat;

    public StausUser(Code cod, Status stat) {
        this.cod = cod;
        this.stat = stat;
    }

    public Code getCod() {
        return cod;
    }

    public void setCod(Code cod) {
        this.cod = cod;
    }

    public Status getStat() {
        return stat;
    }

    public void setStat(Status stat) {
        this.stat = stat;
    }

}
 
