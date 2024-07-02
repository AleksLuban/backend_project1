package model.studentcompare;

import model.Student;

public class AvgExamScoreComparator implements  StudentComparator{

    public int compare(Student o1, Student o2) {
        double d1 = o1.getAvgExamScore();
        double d2 = o2.getAvgExamScore();
        return Double.compare(d2, d1);
    }
}
