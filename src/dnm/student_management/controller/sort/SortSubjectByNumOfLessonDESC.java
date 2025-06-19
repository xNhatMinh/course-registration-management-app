package dnm.student_management.controller.sort;

import java.util.Comparator;
import dnm.student_management.model.Subject;

public class SortSubjectByNumOfLessonDESC implements Comparator<Subject> {

    @Override
    public int compare(Subject o1, Subject o2) {
        return o2.getNumOfLesson() - o1.getNumOfLesson();
    }

}
