package model.universitycompare;

import model.University;

public class YearOfFoundationComparator implements UniversityComparator {
    @Override
    public int compare(University o1, University o2) {
        double d1 = o1.getYearOfFoundation();
        double d2 = o2.getYearOfFoundation();
        return Double.compare(d1, d2);
    }
}
