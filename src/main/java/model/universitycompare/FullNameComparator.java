package model.universitycompare;

import model.University;
import org.apache.commons.lang3.StringUtils;

public class FullNameComparator implements UniversityComparator {
    @Override
    public int compare(University o1, University o2) {

        String s1 = o1.getFullName();
        String s2 = o2.getFullName();
        return StringUtils.compare(s1, s2);
    }
}
