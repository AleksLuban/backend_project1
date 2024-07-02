package model.studentcompare;

import model.Student;
import org.apache.commons.lang3.StringUtils;

public class FullNameComparator implements StudentComparator {

    @Override
    public int compare(Student o1, Student o2) {
        String s1 = o1.getFullName();
        String s2 = o2.getFullName();
        return StringUtils.compare(s1, s2);
    }

}
