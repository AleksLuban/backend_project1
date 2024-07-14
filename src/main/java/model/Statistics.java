package model;

import java.util.ArrayList;

public class Statistics {
    private StudyProfile profile;

    private double avgExamScore;

    private int numbersOfStudents;

    private int numbersOfUniversity;

    private String nameOfUniversities;

    public Statistics() {
    }

    public Statistics(StudyProfile profile, double avgExamScore, int numbersOfStudents, int numbersOfUniversity, String nameOfUniversities) {
        this.profile = profile;
        this.avgExamScore = avgExamScore;
        this.numbersOfStudents = numbersOfStudents;
        this.numbersOfUniversity = numbersOfUniversity;
        this.nameOfUniversities = nameOfUniversities;
    }

    public StudyProfile getProfile() {
        return profile;
    }

    public void setProfile(StudyProfile profile) {
        this.profile = profile;
    }

    public double getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(double avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    public int getNumbersOfStudents() {
        return numbersOfStudents;
    }

    public void setNumbersOfStudents(int numbersOfStudents) {
        this.numbersOfStudents = numbersOfStudents;
    }

    public int getNumbersOfUniversity() {
        return numbersOfUniversity;
    }

    public void setNumbersOfUniversity(int numbersOfUniversity) {
        this.numbersOfUniversity = numbersOfUniversity;
    }

    public String getNameOfUniversities() {
        return nameOfUniversities;
    }

    public void setNameOfUniversities(String nameOfUniversities) {
        this.nameOfUniversities = nameOfUniversities;
    }
}
