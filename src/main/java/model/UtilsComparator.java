package model;

import model.studentcompare.*;
import model.studentcompare.FullNameComparator;
import model.universitycompare.*;

public class UtilsComparator {

    private UtilsComparator() {

    }

    public static StudentComparator studentCompMethod(StudentCompare studentCompare) {
        if (studentCompare == StudentCompare.IdComparator)
            return new IdComparator();
        else if (studentCompare == StudentCompare.FullNameComparator)
            return new FullNameComparator();
        else if (studentCompare == StudentCompare.CurrentCourseNumberComparator)
            return new CurrentCourseNumberComparator();
        else if (studentCompare == StudentCompare.AvgExamScoreComparator)
            return new AvgExamScoreComparator();
        else return null;
    }

    public static UniversityComparator universityCompMethod(UniversityCompare universityCompare) {
        if (universityCompare == UniversityCompare.IdUniversityComparator)
            return new IdUniversityComparator();
        else if (universityCompare == UniversityCompare.FullNameComparator)
            return new model.universitycompare.FullNameComparator();
        else if (universityCompare == UniversityCompare.ShortNameComparator)
            return new ShortNameComparator();
        else if (universityCompare == UniversityCompare.YearOfFoundationComparator)
            return new YearOfFoundationComparator();
        else if (universityCompare == UniversityCompare.MainProfileComparator)
            return new MainProfileComparator();
        else return null;
    }
}
