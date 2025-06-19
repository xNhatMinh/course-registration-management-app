package dnm.student_management.controller.sort;

import java.util.Comparator;
import dnm.student_management.model.Student;

public class SortStudentByNameDESC implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getFirstName().compareTo(o1.getFirstName());
    }
    
}