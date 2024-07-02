package model.universitycompare;

import model.University;
import org.apache.commons.lang3.StringUtils;

public class MainProfileComparator implements UniversityComparator {
    @Override
    public int compare(University o1, University o2) {
        String s1 = o1.getMainProfile().name();
        String s2 = o2.getMainProfile().name();

        return StringUtils.compare(s1, s2);
    }
}
