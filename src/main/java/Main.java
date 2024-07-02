import model.*;
import model.studentcompare.AvgExamScoreComparator;
import model.studentcompare.IdComparator;
import model.studentcompare.StudentComparator;
import model.studentcompare.StudentCompare;
import model.universitycompare.UniversityComparator;
import model.universitycompare.UniversityCompare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


        ArrayList<Student> list = ReadingClass.readStudents();
        list.stream().forEach(System.out::println);
        System.out.println("AFTER SORTING");

        StudentComparator studentComparator = UtilsComparator.studentCompMethod(StudentCompare.AvgExamScoreComparator);
        StudentComparator studentComparator2 = UtilsComparator.studentCompMethod(StudentCompare.FullNameComparator);
        UniversityComparator universityComparator = UtilsComparator.universityCompMethod(UniversityCompare.ShortNameComparator);

        Collections.sort(list, studentComparator);
        list.stream().forEach(System.out::println);

        ArrayList<University> list2 = ReadingClass.readUniversity();

        Collections.sort(list2, universityComparator);
        list2.stream().forEach(System.out::println);
    }
}
