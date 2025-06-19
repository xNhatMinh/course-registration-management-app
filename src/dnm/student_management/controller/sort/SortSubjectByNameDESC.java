package dnm.student_management.controller.sort;

import java.util.Comparator;
import dnm.student_management.model.Subject;

public class SortSubjectByNameDESC implements Comparator<Subject> {

    @Override
    public int compare(Subject o1, Subject o2) {
        return o2.getName().compareTo(o1.getName());
    }
    
}