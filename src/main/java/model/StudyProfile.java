package model;

public enum StudyProfile {

    MEDICINE("Медицина"),
    PHYSICS("Физика"),
    INFORMATIC("Информатика"),
    CHEMISTRY("Химия"),
    BIOLOGY("Биология"),

    MATHEMATICS("Математика"),

    LINGUISTICS("Лингвистика");

    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
