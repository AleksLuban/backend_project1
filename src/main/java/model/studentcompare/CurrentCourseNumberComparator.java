package model.studentcompare;

import model.Student;

public class CurrentCourseNumberComparator implements StudentComparator {
    @Override
    public int compare(Student o1, Student o2) {
        double d1 = o1.getCurrentCourseNumber();
        double d2 = o2.getCurrentCourseNumber();
        return Double.compare(d1, d2);
    }
}
