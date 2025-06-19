/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dnm.student_management.controller.sort;

import dnm.student_management.model.Registering;
import java.util.Comparator;

/**
 *
 * @author dnm79
 */
public class SortRegisteringByStudentNameZA implements Comparator<Registering> {

    @Override
    public int compare(Registering o1, Registering o2) {
        return o2.getStudent().getFirstName()
                .compareTo(o1.getStudent().getFirstName());
    }
}
