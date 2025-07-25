package dnm.student_management.exception;

public class InvalidStudentIdException extends Exception {

    private String invalidStudentId;

    public InvalidStudentIdException() {
    }

    public InvalidStudentIdException(String invalidStudentId, String message) {
        super(message);
        this.invalidStudentId = invalidStudentId;
    }

    public String getInvalidStudentId() {
        return invalidStudentId;
    }

    public void setInvalidStudentId(String invalidStudentId) {
        this.invalidStudentId = invalidStudentId;
    }
}
