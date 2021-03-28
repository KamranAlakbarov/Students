/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.table;

import az.model.Student;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Kamran
 */
public class StudentTableModel extends AbstractTableModel {

    private final String[] COLUMN_NAMES = {"Id", "Name", "Surname", "Age", "Point", "City", "Gender", "Favorite"};
    private List<Student> students;

    public StudentTableModel(final List<Student> students) {
        this.students = students;
    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public String getColumnName(int columnindex) {
        return COLUMN_NAMES[columnindex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student student = students.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return student.getId();
            case 1:
                return student.getName();
            case 2:
                return student.getSurname();
            case 3:
                return student.getAge();
            case 4:
                return student.getPoint();
            case 5:
                return student.getCity();
            case 6:
                return student.getGender();
            case 7:
                return student.getFavorite();
            default:
                return null;

        }
    }

}
