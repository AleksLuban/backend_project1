package model.studentcompare;

import model.Student;
import org.apache.commons.lang3.StringUtils;

public class IdComparator implements StudentComparator {
    @Override
    public int compare(Student o1, Student o2) {
        String s1 = o1.getUniversityId();
        String s2 = o2.getUniversityId();
        return StringUtils.compare(s1, s2);
    }
}
