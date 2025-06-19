package dnm.student_management.controller;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import dnm.student_management.exception.InvalidDateOfBirthException;
import dnm.student_management.exception.InvalidEmailException;
import dnm.student_management.exception.InvalidNameException;
import dnm.student_management.exception.InvalidPersonIdException;
import dnm.student_management.exception.InvalidPhoneNumberException;
import dnm.student_management.exception.InvalidStudentIdException;
import dnm.student_management.model.Registering;

public class InfoFilterImp implements InforFilter {

    @Override
    public boolean isStudentIdValid(String id) throws InvalidStudentIdException {
        var regex = "^[a-z]\\d{2}[a-z]{4}\\d{3}$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(id);
        if(matcher.matches()) {
            return true;
        } else {
            var msg = "Invalid student ID: " + id;
            throw new InvalidStudentIdException(id, msg);
        }
    }

    @Override
    public boolean isPersonIdValid(String id) throws InvalidPersonIdException {
        var regex = "^([A-Z0-9]{9,13})$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(id);
        if(matcher.matches()) {
            return true;
        } else {
            var msg = "Invalid ID/Passport number: " + id;
            throw new InvalidPersonIdException(id, msg);
        }
    }

    @Override
    public boolean isNameValid(String name) throws InvalidNameException {
        var regex = "^([a-zA-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠ"
                + "ỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ]+\\s?){2,30}$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | 
                Pattern.CANON_EQ | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()) {
            return true;
        } else {
            var msg = "Invalid name: " + name;
            throw new InvalidNameException(name, msg);
        }
    }

    @Override
    public boolean isEmailValid(String email) throws InvalidEmailException {
        var regex = "^[a-z]+[a-z0-9._]*@gmail.com$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()) {
            return true;
        } else {
            var msg = "Invalid email: " + email;
            throw new InvalidEmailException(email, msg);
        }
    }

    @Override
    public boolean isPhoneNumberValid(String phoneNumber) 
            throws InvalidPhoneNumberException {
        var regex = "^(03|04|07|08|09)\\d{8}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        if(matcher.matches()) {
            return true;
        } else {
            var msg = "Invalid phone number: " + phoneNumber;
            throw new InvalidPhoneNumberException(phoneNumber, msg);
        }
    }

    @Override
    public boolean isDateOfBirthValid(String dobString) 
            throws InvalidDateOfBirthException {
        var regex = "^\\d{2}/\\d{2}/\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dobString);
        if(matcher.matches()) {
            return true;
        } else {
            var msg = "Invalid date of birth: " + dobString;
            throw new InvalidDateOfBirthException(dobString, msg);
        }
    }

    @Override
    public boolean isRecordExist(List<Registering> registerings, Registering r) {
        return registerings.contains(r);
    }
    
}
