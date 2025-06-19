package dnm.student_management.controller;

import java.util.List;
import dnm.student_management.exception.InvalidDateOfBirthException;
import dnm.student_management.exception.InvalidEmailException;
import dnm.student_management.exception.InvalidNameException;
import dnm.student_management.exception.InvalidPersonIdException;
import dnm.student_management.exception.InvalidPhoneNumberException;
import dnm.student_management.exception.InvalidStudentIdException;
import dnm.student_management.model.Registering;

public interface InforFilter {

    boolean isStudentIdValid(String id) throws InvalidStudentIdException;

    boolean isPersonIdValid(String id) throws InvalidPersonIdException;

    boolean isNameValid(String name) throws InvalidNameException;

    boolean isEmailValid(String email) throws InvalidEmailException;

    boolean isPhoneNumberValid(String phoneNumber) 
            throws InvalidPhoneNumberException;

    boolean isDateOfBirthValid(String dobString) 
            throws InvalidDateOfBirthException;
    
    boolean isRecordExist(List<Registering> registerings, Registering r);
}
