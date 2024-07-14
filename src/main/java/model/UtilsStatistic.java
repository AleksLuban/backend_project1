package model;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class UtilsStatistic {

    public static List<Statistics> getStatistics(List<Student> students, List<University> universities) {
        List<Statistics> result = new ArrayList<>();

        Set<StudyProfile> profiles = universities.stream().map(University::getMainProfile).collect(Collectors.toSet());

        profiles.forEach(studyProfile -> {

            Statistics statistics = new Statistics();
            result.add(statistics);
            statistics.setProfile(studyProfile);

            List<String> idUniversities = universities.stream().filter(university -> university.getMainProfile()
                    .equals(studyProfile)).map(University::getId).toList();
            statistics.setNumbersOfUniversity(idUniversities.size());
            statistics.setNameOfUniversities(StringUtils.EMPTY);

            universities.stream().filter(university -> idUniversities.contains(university.getId()))
                    .map(University::getFullName).forEach(fullname -> statistics
                            .setNameOfUniversities(statistics.getNameOfUniversities() + fullname + ", "));

            List<Student> studentList = students.stream().filter(student -> idUniversities
                    .contains(student.getUniversityId())).toList();
            statistics.setNumbersOfStudents(studentList.size());

            OptionalDouble score = studentList.stream().mapToDouble(Student::getAvgExamScore).average();

            statistics.setAvgExamScore(0);
            score.ifPresent(value -> statistics.setAvgExamScore(BigDecimal.valueOf(value)
                    .setScale(2, RoundingMode.HALF_UP).doubleValue()));

        });
        return result;
    }

}
