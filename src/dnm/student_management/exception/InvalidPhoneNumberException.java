package dnm.student_management.exception;

public class InvalidPhoneNumberException extends Exception {

    private String invalidPhoneNumber;

    public InvalidPhoneNumberException() {
    }

    public InvalidPhoneNumberException(String invalidPhoneNumber, String message) {
        super(message);
        this.invalidPhoneNumber = invalidPhoneNumber;
    }

    public String getInvalidPhoneNumber() {
        return invalidPhoneNumber;
    }

    public void setInvalidPhoneNumber(String invalidPhoneNumber) {
        this.invalidPhoneNumber = invalidPhoneNumber;
    }
}
