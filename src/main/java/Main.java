import model.*;
import model.studentcompare.AvgExamScoreComparator;
import model.studentcompare.IdComparator;
import model.studentcompare.StudentComparator;
import model.studentcompare.StudentCompare;
import model.universitycompare.UniversityComparator;
import model.universitycompare.UniversityCompare;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        ArrayList<Student> list = ReadingClass.readStudents();
        list.stream().forEach(System.out::println);
        System.out.println("AFTER SORTING");

        StudentComparator studentComparator = UtilsComparator.studentCompMethod(StudentCompare.AvgExamScoreComparator);
        StudentComparator studentComparator2 = UtilsComparator.studentCompMethod(StudentCompare.FullNameComparator);
        UniversityComparator universityComparator = UtilsComparator.universityCompMethod(UniversityCompare.ShortNameComparator);

        list.stream().sorted(studentComparator).forEach(System.out::println);

        ArrayList<University> list2 = ReadingClass.readUniversity();

        Collections.sort(list2, universityComparator);
        list2.stream().sorted(universityComparator).forEach(System.out::println);

        System.out.println("SERIALIZATION");

//        List<String> result = JsonUtil.serialStudentCollection(list);
//        result.stream().forEach(System.out::println);
//
//        List<Student> result2 = JsonUtil.deserialStudentCollection(result);
//        result2.stream().forEach(System.out::println);

        list.stream().filter(student -> student.getAvgExamScore() > 4.5).forEach(student -> {
            String str = JsonUtil.serialStudent(student);
            System.out.println(str);
            System.out.println(JsonUtil.deserialStudent(str));
        });

        List<Statistics> statistics = UtilsStatistic.getStatistics(list, list2);
        WritingClass.writeStatistic(statistics, "src\\main\\resources\\statistic.xlsx");

    }
}
