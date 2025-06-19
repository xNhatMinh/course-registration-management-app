package dnm.student_management.controller.sort;

import java.util.Comparator;
import dnm.student_management.model.Student;

public class SortStudentByNameASC implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
    
}
