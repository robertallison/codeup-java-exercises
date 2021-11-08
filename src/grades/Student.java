package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> grades;

    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<Integer>();
    }

    public String returnName() {
        return this.studentName;
    }
}
